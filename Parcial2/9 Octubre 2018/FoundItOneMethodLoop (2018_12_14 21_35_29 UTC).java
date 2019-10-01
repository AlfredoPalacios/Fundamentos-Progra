import java.util.*;
/*  Alfredo Palacios Olagaray
	9 October 2018
	Using methods to find a char */
public class FoundItOneMethodLoop{
	
	public static void main(String[]args){
		
		//declaring variables
		Scanner kb=new Scanner(System.in);
		String word="", character="", response="";
		int position=0;
		boolean anotherWord=true;
		
		//process
		while(anotherWord){//loop to check lots of words
		System.out.println("Enter the word:");
		word=kb.next();
		System.out.println("Enter the char you want to find:");
		character=kb.next();
		position=thePosition(word,character);//invokes thePosition method and stores the retuned value in the variale position
		System.out.println("The character " + character + " is in the position " + position);
		System.out.println("Do you want to find another char in another word? Yes or no.");
		response=kb.next().toLowerCase();//sets response to lower case
		if(response.equals("yes"))//checks if another iteration has to be done
			anotherWord=true;
		else
			anotherWord=false;
		}//end of while
		
	}//here ends main method
	
	public static int thePosition(String word, String character){
		return word.indexOf(character);//returns the position
	}//here ends thePosition
	
}//here ends FoundItOneMethod