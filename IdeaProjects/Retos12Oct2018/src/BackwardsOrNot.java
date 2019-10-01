/*
    Alfredo Palacios Olagaray
    12 October 2018
    Program that tells if a word is palindrome (funny thing: palindrome is a weapon in Destiny too) or not.
 */
import java.util.Scanner;
public class BackwardsOrNot {

    //no instance variable is needed in this design of the problem

    public static void main(String[]args){

        //local variables
        Scanner kb=new Scanner(System.in);
        String word="";
        boolean isIt=false;             //sets isIt to false

        //process
        System.out.println("Give me a word and I'll tell you if it's palindrome or not.");
        word=kb.next();
        isIt=palindromeOrNot(word);     //invokes palindromeOrNot method and stores the returned value in the variable isIt
        if(isIt==true)                  //checks if the method returned a true value
            System.out.println("The word " + word + " is palindrome.");
        else                            //does this if the returned value was false
            System.out.println("The word " + word + " isn't palindrome.");

    }//here ends main method

    public static boolean palindromeOrNot(String theWord){

        //local variables
        String reversed="";
        int size=0, counter=0;

        //process
        size=theWord.length()-1;                        //subtracts 1 to the length to prevent run-time error
        for(counter=size; counter>=0; counter--){       //starts for loop to reverse the word
            reversed+=theWord.charAt(counter);          //puts together the reversed word
        }//here ends for loop
        if(reversed.equalsIgnoreCase(theWord))          //compares the reversed word to the original
            return true;                                //returns true if words are equal
        else
            return false;                               //returns false if words aren't equal

    }//here ends palindromeOrNot method

}//here ends BackwardsOrNot
