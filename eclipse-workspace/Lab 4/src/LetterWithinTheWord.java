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
		word=kb.next();								//gets the word
		size=word.length()-1;						//gets the size minus 1 to prevent errors
		System.out.println("Please enter the char you want to find:");
		character=kb.next().charAt(0);				//gets the char the user wants to find
		for(counter=0; counter<=size; counter++) {	//loop to go char by char
			if(word.charAt(counter)==character) {	//condition to check if the char at position
													//counter equals the desired one
				isInTheWord=true;					//sets the variable to true 
			}
		}
		if(isInTheWord) {							//the condition is the boolean variabe
			System.out.println("The char " + character + " is in the word " + word + ".");
		}
		else
			System.out.println("The char " + character + " isn't in the word " + word + ".");
		
	}

}