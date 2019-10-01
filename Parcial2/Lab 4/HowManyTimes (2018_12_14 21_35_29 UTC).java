import java.util.Scanner;

/*  Alfredo Palacios Olagaray
	23 September 2018
	Program that  */

public class HowManyTimes {

	public static void main(String[] args) {
		
		//declaring and initializing all variables
		Scanner kb = new Scanner (System.in);
		int sum=0, counter=0, size=0;
		String word="";
		char character=' ';
		
		//process
		System.out.println("Please enter a word:");
		word=kb.next();								//gets the word
		size=word.length()-1;						//gets the size minus 1 to prevent error
		System.out.println("Please enter the char you want me to find.");
		character=kb.next().charAt(0);				//gets the char
		for(counter=0; counter<=size; counter++) {	//loop to go char by char
			if(character==word.charAt(counter)) {	//condition to check if the char at position counter equals
													//the desired char
				sum++;								//ads 1 each time the condition is true
			}
		}
		System.out.println("Letter " + character + " appears " + sum + " times in the word " + word + ".");

	}

}