import java.util.*;
/*  Alfredo Palacios Olagaray
	9 October 2018
	Using methods to find a char */
public class FoundIt{

	//instance variables
	public static String word = "";
	public static String letter = "";
	public static int size = 0;

	public static void main(String[]args){

		//variable declaration
		Scanner kb=new Scanner(System.in);
		int position=0;

		word=updateWord();
		letter=readingTheChar();
		position=thePosition(word,letter);
		System.out.println("The char " + letter + " is in the position " + position);

	}//here ends main method

	public static String updateWord(){
		Scanner kb=new Scanner(System.in);
		String wordUpdate="";
		System.out.println("Please enter the word.");
		wordUpdate=kb.next();
		return wordUpdate;

	}//here ends updateWord

	public static String readingTheChar(){
		Scanner kb=new Scanner(System.in);
		String theCharString="";
		System.out.println("Enter the char you want to find.");
		theCharString=kb.next();
		return theCharString;
	}//here ends readingTheChar

	public static int thePosition(String theWord, String theLetter){
		int realPosition=0;
		size=word.length();
		realPosition=theWord.indexOf(theLetter);
		return realPosition;
	}//here ends thePosition

}//here ends FoundIt