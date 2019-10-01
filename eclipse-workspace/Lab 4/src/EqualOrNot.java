import java.util.Scanner;
/*  Alfredo Palacios Olagaray
	23 September 2018
	Program that tells wether or not two words are equal  */
public class EqualOrNot {
	public static void main(String[] args) {
		
		//declaring and initializing all variables
		Scanner kb = new Scanner(System.in);
		String word1="", word2="";
		
		//process
		System.out.println("Please enter the first word:");
		word1=kb.next();							//gets the first word
		System.out.println("Please enter the second word:");
		word2=kb.next();							//gets the second word
		if(word1.equalsIgnoreCase(word2)) {			//condition to check if word1 equals word 2
			System.out.println("Words are equal.");
		}
		else {
			System.out.println("Words aren't equal.");
		}

	}//here ends main method
}//here ends exercise 2
