import java.util.Scanner;
public class NumberOfChars{
	/*  Alfredo Palacios Olagaray
		21 September 2018
		Printing a word in reverse order */
	public static void main(String[]args){

		//declaring and initializing all variables
		Scanner kb = new Scanner(System.in);
		int length=0;
		String word="";

		//process
		System.out.println("Enter any word:");
		word=kb.next();				//gets the word
		length=word.length();		//gets the length
		System.out.println("The word " + word + " has " + length + " chars or letters.");

	}//here ends main method
}//here ends exercise 1 number of chars