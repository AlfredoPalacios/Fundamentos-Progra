/*
    Alfredo Palacios Olagaray
    Program that stores the calories and portions you have consumed,
    lets you reset the data, see a summary or save and exit.
    Due: 26 November 2018
*/
import java.io.*;
import java.util.Scanner;
public class WeightControlAppAlfredo {

    public static String[][] categoriesActualLimits=new String[8][4];
    public static String[][] foodPortionsCalories=new String[3][89];

    public static Scanner kb=new Scanner(System.in);
    private static String whatEat;

    public static void main(String[] args) throws IOException {

        //variable declaration
        int selection;
        int positionFood=-1;
        int category=0;
        int control=0;
        String whatEat=null;
        String caloriesCatStr="0.0";
        double units=0.0;
        double portions=0.0;
        double calories=0.0;
        double totalCalories=0.0;
        double caloriesCat=0.0;
        double sum=0.0;

        foodWithCalories();
        categoriesAndLimits();

        do{
            selection=mainMenuSelection();
            while ((selection <= 0) || (selection >= 5)) {
                System.out.println("Please enter a valid selection number.");
                System.out.println("Valid selection numbers are 1, 2, 3, or 4.");
                System.out.println("ONLY INTEGERS, PLEASE :)");
                selection=mainMenuSelection();
            }//end of while
            //System.out.println(selection);

            if (selection==1){
                System.out.println("What did you eat? (Without whitespaces, please).");
                whatEat=kb.next();
                positionFood=position(whatEat);
                if((positionFood<0)||(positionFood>89)){
                    System.out.println("Your food was not found. Enter a valid type of food.");
                }//end if food was not found
                else{
                    System.out.println("How did you eat it? 1 for units, 2 for portions.");
                    int unitsOrPortions=0;
                    unitsOrPortions=kb.nextInt();
                    if(unitsOrPortions==2){
                        System.out.println("How many portions did you eat?");
                        portions=kb.nextDouble();
                        category=obtainingCategory(positionFood);
                        categoriesActualLimits[category][2]=""+portions;
                    }//end if units or portions
                    else{
                        System.out.println("How many units did you eat?");
                        units=kb.nextDouble();
                        portions=convertUnitsToPortions(units, positionFood);
                        category=obtainingCategory(positionFood);
                        categoriesActualLimits[category][2]=""+portions;
                        //printSummary(totalCalories);
                    }//end of else units or portions
                    calories=obtainingCalories(positionFood, portions);
                    sum+=calories;
                    categoriesActualLimits[category][3]=""+sum;
                    totalCalories=0.0;
                    for(int x=0; x<8; x++){
                        caloriesCatStr=categoriesActualLimits[x][3];
                        caloriesCat=Double.parseDouble(caloriesCatStr);
                        System.out.println(caloriesCat);
                        totalCalories+=caloriesCat;
                        System.out.println(totalCalories);
                    }//end of  for
                    
                }//end else food was found
            }else if (selection==2){
                printSummary(totalCalories);
            }else if (selection==3){
                resetData(totalCalories);
                totalCalories=0.0;
            }else if (selection==4){
                saveAndExit(totalCalories);
                break;
            }//end ifs
        }//end of do
        while((selection==1)||(selection==2)||(selection==3)||(selection==4));


    }//end of main
    //---------------------------------------------------------------------------------------------------------------------------

    public static int mainMenuSelection(){
        //displays the main menu and returns the user selection

        int selection;

        System.out.println("*App developed by Alfredo Palacios Olagaray*");
        System.out.println("*Programming fundamentals final project*");
        System.out.println();
        System.out.println();
        System.out.println("Hi! Welcome to the Weight Control App.");
        System.out.println("Here you can manage your calories, see your limits,");
        System.out.println("register calories you have consumed, see a summary,");
        System.out.println("or save your data into a file.");
        System.out.println();
        System.out.println("To begin, please select one of the following options:");
        System.out.println();
        System.out.println("Option 1: Register food (here you can register what you have eaten).");
        System.out.println("Option 2: See a summary (see the limits and your actual consumption).");
        System.out.println("Option 3: Reset data (set all your consumption values back to zero).");
        System.out.println("Option 4: Save and exit (saves your stored data in a file and exits the app).");
        System.out.println();
        System.out.println("To select one of the above, please enter the option number.");
        System.out.println("e.g. enter \"1\" to select Option 1. Enter \"2\" for Option 2 and so on.");
        selection = kb.nextInt();
        return selection;

    }//end of mainMenuSelection
    //---------------------------------------------------------------------------------------------------------------------------

    public static void categoriesAndLimits(){
        //gets the array for the categories, limits, and actual consumption

        String fileName="catwactualandlimits.txt";
        Scanner inputStream=null;
        try{
            inputStream=new Scanner(new File(fileName));
        }//end of try

        catch(FileNotFoundException e){
            System.out.println("Error opening the file " + fileName);
            System.exit(0);
        }//end of catch

        while(inputStream.hasNext()) {
            for(int y=0; y<4; y++){
                for(int x=0; x<8; x++){
                    categoriesActualLimits[x][y] = inputStream.next();
                    //System.out.print(categoriesActualLimits[x][y] + " ");
                }//end of second for
            }//end first for
        }//end of while
        //System.out.print(categoriesActualLimits[1][2]);
        inputStream.close();//java actually closes the file for you when the program is finished, 
                            //but it's more secure this way

    }//end of categoriesAndLimits
    //---------------------------------------------------------------------------------------------------------------------------

    public static void foodWithCalories(){
        //gets the array for the list of foods and their respective calories and how many units is one portion

        String fileName="food.txt";
        Scanner inputStream=null;
        try{
            inputStream=new Scanner(new File(fileName));
        }//end of try

        catch(FileNotFoundException e){
            System.out.println("Error opening the file " + fileName);
            System.exit(0);
        }//end of catch

        while(inputStream.hasNext()) {
            for(int y=0; y<89; y++){
                for(int x=0; x<3; x++){
                    foodPortionsCalories[x][y]=inputStream.next();
                    //System.out.print(foodPortionsCalories[x][y] + " ");
                }//end of second for
            }//end of first for
        }//end of while
        //System.out.print(foodPortionsCalories[2][1]);
        inputStream.close();

    }//end of foodWithCalories
    //---------------------------------------------------------------------------------------------------------------------------

    public static int position(String whatEat){
        //gets the position of the desired food

        int position=-1;
        boolean foundIt=false;

        for(int x=0; x<foodPortionsCalories.length; x++){
            for(int y=0; y<89; y++){
                if(whatEat.equalsIgnoreCase(foodPortionsCalories[x][y])){
                    position=y;
                    foundIt=true;
                    break;
                }//here ends if
            }//end of second for
            if(foundIt){
                break;
            }//end of if
        }//end of first for
        //System.out.println(foodPortionsCalories.length);
        //System.out.println(position);
        return position;

    }//end of position
    //---------------------------------------------------------------------------------------------------------------------------

    public static double convertUnitsToPortions(double units, int positionFood){
        //converts units into portions in case it is necessary

        double portionsCalculated;
        double unitsThatMakeAPortion;

        unitsThatMakeAPortion=Double.parseDouble(foodPortionsCalories[1][positionFood]);
        portionsCalculated=(units/unitsThatMakeAPortion);

        return portionsCalculated;

    }//end of convertUnitsToPortions
    //---------------------------------------------------------------------------------------------------------------------------

    public static void printSummary(double totalCalories){
        //prints the summary. Appearance may vary depending on the program you are running this in

        int counter=0;

        for(int y=0; y<4; y++, counter++){
            if(counter==0){
                System.out.print("Category: \t\t\t\t| ");
            }else if(counter==1){
                System.out.print("Limit (in portions): \t| ");
            }else if(counter==2){
                System.out.print("Actual consumption: \t| ");
            }else if(counter==3){
                System.out.print("Actual calories: \t\t| ");
            }
            for(int x=0; x<8; x++){
                if(y==0) {
                    System.out.print(categoriesActualLimits[x][y] + " \t");
                }else if(((y==1)||(y==2)||(y==3))&&(x<2)){
                    System.out.print(categoriesActualLimits[x][y] + " \t\t");
                }else if(((y==1)||(y==2)||(y==3))&&(x==2)){
                    System.out.print(categoriesActualLimits[x][y] + " \t\t\t");
                }else if(((y==1)||(y==2)||(y==3))&&(x==3)){
                    System.out.print(categoriesActualLimits[x][y] + " \t\t\t\t");
                }else if(((y==1)||(y==2)||(y==3))&&(x==4)) {
                    System.out.print(categoriesActualLimits[x][y] + " \t\t");
                }else
                    System.out.print(categoriesActualLimits[x][y] + " \t\t\t");
            }//end of second for
            System.out.println();
        }//end first for

        System.out.println(totalCalories);

    }//end of printSummary
    //---------------------------------------------------------------------------------------------------------------------------

    public static void resetData(double totalCalories){
        //resets the data you already have to zero

        for(int y=0; y<4; y++){
            for(int x=0; x<8; x++){
                categoriesActualLimits[x][2] = "0";
                categoriesActualLimits[x][3] = "0";
                //System.out.print(categoriesActualLimits[x][y] + " ");
            }//end of second for
        }//end first for

        totalCalories=0.0;

    }//here ends resetData
    //---------------------------------------------------------------------------------------------------------------------------

    public static int obtainingCategory(int foodPosition){
        //gets the category of the food the user chose

        int whatCategory=-1;

        if((foodPosition>=0)&&(foodPosition<=17)){
            whatCategory=0;
        }else if((foodPosition>=18)&&(foodPosition<=30)){
            whatCategory=1;
        }else if((foodPosition>=31)&&(foodPosition<=48)){
            whatCategory=2;
        }else if((foodPosition>=49)&&(foodPosition<=55)){
            whatCategory=3;
        }else if((foodPosition>=56)&&(foodPosition<=63)){
            whatCategory=4;
        }else if((foodPosition>=64)&&(foodPosition<=70)){
            whatCategory=5;
        }else if((foodPosition>=71)&&(foodPosition<=74)){
            whatCategory=6;
        }else if((foodPosition>=75)&&(foodPosition<=88)){
            whatCategory=7;
        }//end of ifs

        return whatCategory;

    }//end of obtainingCategory
    //---------------------------------------------------------------------------------------------------------------------------

    public static double obtainingCalories(int foodPosition, double portions){
        //gets the total calories of the food

        double foodCalories=0.0;
        double cals=0.0;

        foodCalories=Double.parseDouble(foodPortionsCalories[2][foodPosition]);
        cals=foodCalories*portions;

        return cals;

    }//end of calories
    //---------------------------------------------------------------------------------------------------------------------------

    public static void saveAndExit(double totalCalories){
        //saves data into a *.txt file and exits the program

        String outputFile="yourData.txt";
        PrintWriter theOutput= null;
        try{
            theOutput = new PrintWriter(outputFile);
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }

        int counter=0;

        for(int y=0; y<4; y++, counter++){
            if(counter==0){
                theOutput.print("Category: \t\t| ");
            }else if(counter==1){
                theOutput.print("Limit (in portions): \t| ");
            }else if(counter==2){
                theOutput.print("Actual consumption: \t| ");
            }else if(counter==3){
                theOutput.print("Actual calories: \t| ");
            }
            for(int x=0; x<8; x++){
                if(y==0) {
                    theOutput.print(categoriesActualLimits[x][y] + " \t");//Categorías
                }else if(((y==1)||(y==2)||(y==3))&&(x<1)){
                    theOutput.print(categoriesActualLimits[x][y] + " \t\t");//Verduras y Frutas
                }else if(((y==1)||(y==2)||(y==3))&&(x==1)) {
                    theOutput.print(categoriesActualLimits[x][y] + " \t");//cereales
                }else if(((y==1)||(y==2)||(y==3))&&(x==2)){
                    theOutput.print(categoriesActualLimits[x][y] + " \t\t");//leguminosas
                }else if(((y==1)||(y==2)||(y==3))&&(x==3)){
                    theOutput.print(categoriesActualLimits[x][y] + " \t\t");//AoA
                }else if(((y==1)||(y==2)||(y==3))&&(x==4)) {
                    theOutput.print(categoriesActualLimits[x][y] + " \t");//Lácteos
                }else
                    theOutput.print(categoriesActualLimits[x][y] + " \t\t");//Azúcares
            }//end of second for
            theOutput.println();
        }//end first for

        theOutput.println();
        theOutput.println("Total calories: " + totalCalories);

        theOutput.close();

    }//end of saveAndExit
    //---------------------------------------------------------------------------------------------------------------------------

}//end of WeightControlAppAlfredo
//one day creation. Nearly killed myself. Won't do this again.
