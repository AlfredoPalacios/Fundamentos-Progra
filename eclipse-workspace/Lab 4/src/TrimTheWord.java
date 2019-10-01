import java.util.Scanner;

/*  Alfredo Palacios Olagaray
	23 September 2018
	Program that  */

public class TrimTheWord {

	public static void main(String[] args) {
		
		//declaring and initializing all variables
		Scanner kb = new Scanner(System.in);
		int size=0, beginning=0, end=0, counter=0;
		String word="", segment="";
		
		//process
		System.out.print("Please enter a word: ");
		word=kb.next();				//gets the word
		size=word.length()-1;		//gets the size minus 1 to prevent errors
		System.out.print("Where do you want the new word to begin at?: ");
		beginning=kb.nextInt();		//gets the position the user wants to start at
		System.out.print("Where do you want the new word to finish at?: ");
		end=kb.nextInt();			//gets the position the user wants to finish at
		for(counter=(beginning-1); counter<=(end-1); counter++) {//loop to get the desired chars
			segment+=word.charAt(counter);							//puts the chars together
		}
		System.out.println("Your segment is: \"" + segment + "\" and the size of the original word is: " + (size+1));

	}//here ends main method

}//here ends exercise 6