import java.util.Scanner;
public class CapiAlfredoIdea {
    public static void main(String[]args){

        //local variables
        Scanner kb=new Scanner(System.in);
        String number="";
        boolean capiOrNot=false;

        //process
        System.out.println("Give me an integer number.");
        number=kb.next();
        capiOrNot=capicuaOrNot(number);
        if(capiOrNot==true){
            System.out.println("The number " + number + " is capicúa.");
        }
        else if(capiOrNot==false){
            System.out.println("The number " + number + " isn't capicúa.");
        }

    }//here ends main method

    public static boolean capicuaOrNot(String theNumber){

        //more local variables
        int counter=0, size=0;
        String newNumber="";
        boolean yesOrNo=false;

        //process to determine wether it's capicúa or not
        size=theNumber.length()-1;
        //System.out.println(theNumber + size);
        for(counter=size; counter>=0; counter--){
            newNumber+=theNumber.charAt(counter);
        }//end of for loop
        System.out.println(newNumber);
        if(newNumber.equals(theNumber)){
            yesOrNo=true;
        }
        return yesOrNo;

    }//here ends capicuaOrNot method
}
