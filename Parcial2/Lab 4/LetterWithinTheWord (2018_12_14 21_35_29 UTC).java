import java.util.Scanner;

/*  Alfredo Palacios Olagaray
	23 September 2018
	Program that  */

public class LetterWithinTheWord {

	public static void main(String[] args) {
		
		//declaring and initializing all variables
		Scanner kb = new Scanner(System.in);
		int counter=0, size=0;
		String word="";
		char character=' ';
		boolean isInTheWord=false;
		
		//process
		System.out.println("Please enter a word:");
		word=kb.next();
		size=word.length()-1;
		System.out.println("Please enter the char you want to find:");
		character=kb.next().charAt(0);
		for(counter=0; counter<=size; counter++) {
			if(word.charAt(counter)==character) {
				isInTheWord=true;
			}
		}
		if(isInTheWord) {
			System.out.println("The char " + character + " is in the word " + word + ".");
		}
		else
			System.out.println("The char " + character + " isn't in the word " + word + ".");
		
	}

}