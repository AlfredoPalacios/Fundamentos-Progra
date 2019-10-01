/*  Alfredo Palacios Olagaray
    12 Octubre 2018
    Program that replaces a letter in a sentence  */
import java.util.Scanner;
public class CodeMySecret {

    //instance variable
    public static String sentence="";

    public static void main(String[]args){

        //local variables
        Scanner kb=new Scanner(System.in);
        String letter="", letterReplace="", finalSentence="";
        int size=0;

        //process
        System.out.println("Please give me a sentence: ");
        sentence=kb.nextLine();
        System.out.println("Please give me the letter you want to replace: ");
        letter=kb.next();
        System.out.println("Please give me the new letter: ");
        letterReplace=kb.next();
        finalSentence=encode(letter.charAt(0), letterReplace.charAt(0)); //invokes the encode method
        System.out.println("The final sentence is: \n" + finalSentence); //prints the new sentence

    }//here ends main method

    public static String encode(char letter, char letterReplace){ //method to replace the letter
        String newSentence="";
        newSentence=sentence.replace(letter, letterReplace);    //method that replaces the letter
        return newSentence;                                     //returns the new sentence
    }//here ends encode

}//here ends CodeMySecret
