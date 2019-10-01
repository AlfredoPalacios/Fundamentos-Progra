import java.util.Scanner;
public class ReverseOrder{
	/*  Alfredo Palacios Olagaray
		21 September 2018
		Printing a word in reverse order */
	public static void main(String[]args){

		//declaring and initializing all variables
		Scanner keyboard = new Scanner(System.in);
		int counter=0, size=0;
		String word="";

		//process
		System.out.println("Enter the word you want to reverse:");
		word=keyboard.next();							//gets the word
		size=word.length()-1;							//gets the size minus 1 to prevent errors
		for(counter=size; counter>=0; counter--){		//loop to go char by char
			System.out.print(word.charAt(counter));		//prints the char at position counter
		}
		System.out.println();							//prints an empty line for order

	}//here ends main method
}//here ends exercise 8 reverse order