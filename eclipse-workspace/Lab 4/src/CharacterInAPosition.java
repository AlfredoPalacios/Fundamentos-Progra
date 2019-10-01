import java.util.Scanner;

/*  Alfredo Palacios Olagaray
	23 September 2018
	Program that  */

public class CharacterInAPosition {
	
	public static void main(String[] args) {
	
	//declaring and initializing all variables
	Scanner kb = new Scanner(System.in);
	int size=0, position=0;
	String word="";
	
	//process
	System.out.println("Please input any word.");
	word=kb.next();					//gets the word
	System.out.println("Please enter the position of the char you want:");
	position=kb.nextInt()-1;		//gets the size minus 1 to prevent errors
	System.out.println("The char is: " + word.charAt(position));//prints the char that is at the 
																//desired position

	}

}