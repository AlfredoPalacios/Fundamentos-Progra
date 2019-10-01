import java.util.Scanner;
public class AlfredoPalaciosF {

    public static int[][]instanceVariable={{3,9,1,8},{11,4,2,0},{23,5,7,10},{19,14,28,6}};
    public static final int COLUMNS=4;
    public static final int ROWS=4;

    public static void main(String[] args){

        //variable declaration
        Scanner kb=new Scanner(System.in);
        int sumDiagonal=0;
        int columnUser=0;
        int rowUser=0;
        String phraseUser;
        String phraseTransformed="";

        sumDiagonal=sum();//invokes method sum() and stores returned value in sumDiagonal
        System.out.println("The diagonal sum is: " + sumDiagonal);//prints the sum
        System.out.println();
        System.out.println();

        //-------------------------------------------------------

        System.out.println("Enter the column you want.");//asks for the column
        columnUser=kb.nextInt();//reads the column
        System.out.println("Enter the row you want.");//asks for the row
        rowUser=kb.nextInt();//reads the row
        averageBiggest(columnUser, rowUser);//invokes the method averageBiggest
        System.out.println();
        System.out.println();

        //-------------------------------------------------------

        System.out.println("Enter the phrase you want to transform:");//asks for the phrase
        phraseUser=kb.nextLine();//reads the phrase
        phraseUser=kb.nextLine();
        System.out.println("Original phrase: " + phraseUser);
        System.out.println();
        phraseTransformed=backwards(phraseUser);//invokes the method backwards and stores returned value to phraseTransformed
        System.out.println("Backwards text: " + phraseTransformed);
        System.out.println();
        System.out.println();

    }//end of main
    //------------------------------------------------------------------------------------------------------------------

    public static int sum(){//method to do the sum

        int sum=0;

        for(int x=0; x<COLUMNS; x++) {//counter for the columns
            for(int y=0; y<ROWS; y++) {//counter for the rows
                if((x==0)&&(y==0)) {//checks if position is [0][0]
                    sum+=instanceVariable[y][x];//number in that position is summed to the variable sum
                }else if((x==1)&&(y==1)) {//checks if position is [1][1]
                    sum+=instanceVariable[y][x];//number in that position is summed to the variable sum
                }else if((x==2)&&(y==2)) {//checks if position is [2][2]
                    sum+=instanceVariable[y][x];//number in that position is summed to the variable sum
                }else if((x==3)&&(y==3)) {//checks if position is [3][3]
                    sum+=instanceVariable[y][x];//number in that position is summed to the variable sum
                }//end of ifs
            }//end second for
        }//end first for

        return sum;//returns sum

    }//end of sumDiagonal
    //------------------------------------------------------------------------------------------------------------------

    public static void averageBiggest(int column, int row){//method to get the average and biggest number

        double average=0.0;
        double sum=0.0;
        int number=0;

        for(int x=0; x<COLUMNS; x++) {
            //System.out.println(instanceVariable[row][x]);
            number = (instanceVariable[row][x]);//gets the number in that position
            sum+=number;//sums the number to the previous sum
        }//end of for
        average=sum/COLUMNS;//gets the average
        System.out.println("Row " + row +  " average is " + average);//prints the average

        //----------------------------------------------------

        int max=0;

        for(int y=0; y<ROWS; y++) {
            //System.out.println(instanceVariable[y][column]);
            if(max<=instanceVariable[y][column]){//checks if max is smaller than the number in that position
                max=instanceVariable[y][column];//if it is, the number in that position is stores in sum
            }
        }//end of for
        System.out.println("Column " + column + " biggest value is " + max);//prints the biggest number

    }//end of averageBiggest
    //------------------------------------------------------------------------------------------------------------------

    public static String backwards(String userPhrase){//method to reverse the phrase

        String newPhrase="";
        int size=0;

        size=userPhrase.length()-1;//gets size of the phrase -1 to prevent errors
        for(int counter=size; counter>=0; counter--) {
            newPhrase += userPhrase.charAt(counter);//builds the new phrase
        }

        return newPhrase;//returns the new phrase

    }

}//ned of AlfredoPalaciosF
