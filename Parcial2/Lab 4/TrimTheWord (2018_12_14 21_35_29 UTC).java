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
		word=kb.next();
		size=word.length()-1;
		System.out.print("Where do you want the new word to begin at?: ");
		beginning=kb.nextInt();
		System.out.print("Where do you want the new word to finish at?: ");
		end=kb.nextInt();
		for(counter=(beginning-1); counter<=(end-1); counter++) {
			segment+=word.charAt(counter);
		}
		System.out.println("Your segment is: \"" + segment + "\" and the size of the original word is: " + (size+1));

	}//here ends main method

}//here ends exercise 6