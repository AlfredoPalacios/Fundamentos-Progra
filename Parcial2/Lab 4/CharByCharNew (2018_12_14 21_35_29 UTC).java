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
		word=kb.next();
		size=word.length()-1;
		for(counter=0; counter<size; counter++) {
			System.out.println(Character.toUpperCase(word.charAt(counter)) + " " + Character.toLowerCase(word.charAt(counter)));
		}

	}//here ends main method

}//here ends exercise 7