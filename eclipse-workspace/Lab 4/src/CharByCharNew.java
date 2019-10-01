import java.util.Scanner;

/*  Alfredo Palacios Olagaray
	23 September 2018
	Program that  */

public class CharByCharNew {

	public static void main(String[] args) {
		
		//declaring and initializing all variables
		Scanner kb = new Scanner(System.in);
		String word="";
		int counter=0, size=0;
		
		//process
		System.out.print("Please input a word: ");
		word=kb.next();								//gets the word
		size=word.length()-1;						//gets the size minus 1 to prevent error
		for(counter=0; counter<=size; counter++) {	//loop to go char by char
			System.out.println(Character.toUpperCase(word.charAt(counter)) + " " + Character.toLowerCase(word.charAt(counter)));
			//converts each char to upper case and lower case to print them
		}

	}//here ends main method

}//here ends exercise 7