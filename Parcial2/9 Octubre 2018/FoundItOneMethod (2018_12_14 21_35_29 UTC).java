import java.util.*;
/*  Alfredo Palacios Olagaray
	9 October 2018
	Using methods to find a char */
public class FoundItOneMethod{
	
	public static void main(String[]args){
		
		//declaring variables
		Scanner kb=new Scanner(System.in);
		String word="", character="";
		int position=0;
		
		System.out.println("Enter the word:");
		word=kb.next();
		System.out.println("Enter the char you want to find:");
		character=kb.next();
		position=thePosition(word,character);//invokes thePosition method and stores the retuned value in the variale position
		System.out.println("The character " + character + " is in the position " + position);
		
	}//here ends main method
	
	public static int thePosition(String word, String character){
		return word.indexOf(character);//returns the position
	}//here ends thePosition
	
}//here ends FoundItOneMethod