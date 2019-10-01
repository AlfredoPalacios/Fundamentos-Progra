/*
	Alfredo Palacios Olagaray
	5 October 2018
	Program to find a char in a word. Tells the position.
*/
import java.util.Scanner;
public class FoundIt {
    public static void main(String[]args){

        //declaring variables
        Scanner kb=new Scanner(System.in);
        String word, character, response;
        int position;
        boolean anotherWord=true;

        //process
        while(anotherWord){																			//loop to check lots of words
            System.out.println("Enter the word:");
            word=kb.next().toLowerCase();
            System.out.println("Enter the char you want to find:");
            character=kb.next().toLowerCase();
            position=thePosition(word,character);													//invokes thePosition method and stores the retuned value
																									//in the variale position
            System.out.println("The character " + character + " is in the position " + position);
            System.out.println("Do you want to find another char in another word? Yes or no.");
            response=kb.next().toLowerCase();														//sets response to lower case
            anotherWord = response.equals("yes");													//checks if another iteration has to be done
        }//end of while

    }//here ends main method

    public static int thePosition(String word, String character){
        return word.indexOf(character);		//returns the position
    }//here ends thePosition
}