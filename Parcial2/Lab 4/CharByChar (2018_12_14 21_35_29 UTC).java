import java.util.Scanner;

/*  Alfredo Palacios Olagaray
	23 September 2018
	Program that prints a word char by char  */

public class CharByChar {

	public static void main(String[] args) {

		//declaring and initializing all variables
		Scanner kb = new Scanner(System.in);
		String word="";
		int size=0, counter=0;

		//process
		System.out.println("Please enter a word and I'll print it char by char.");
		word = kb.next();
		size=word.length()-1;
		for(counter=0; counter<=size; counter++) {
			System.out.println(word.charAt(counter));
		}


	}//here ends main method

}//here ends exercise 3