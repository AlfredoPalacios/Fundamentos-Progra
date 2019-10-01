import java.util.*;
/*  Alfredo Palacios Olagaray
	5 October 2018
	Write a bunch of methods to practice */
public class MySuperHero{
	
	//instance variables
	public static String name = "";			//instance variable
	public static String punchType = "";

	public static void main(String[]ars){

		//variables declaration
		int life=100;						//local variable

		//printName();
		name=updateName();
		//printName();
		printStats(life);
		life=lifeLevel(punchType, life);
		printStats(life);
	}//end of main method

	public static int lifeLevel(String punchType, int theLife){
		Scanner kb=new Scanner(System.in);
		int temp=0;
		System.out.println("Enter \"strong\", \"medium\", or \"low\". Each one corresponding to the hit your hero took.");
		punchType=kb.next();
		if(punchType.equalsIgnoreCase("strong")){
			temp=theLife-20;
		}
		else if(punchType.equalsIgnoreCase("medium")){
			temp=theLife-15;
		}
		else if(punchType.equalsIgnoreCase("low")){
			temp=theLife-5;
		}
		return temp;

	}//here ends lifeLevel method

	public static void printStats(int theLife){
		System.out.println("The name of your hero is: " + name + "\n" +
		"and the life level is: " + theLife);

	}//here ends printStats method

	public static void printName(){
		System.out.println("Your hero's name is: " + name);
	}//end of printName method

	public static String updateName(){
		Scanner kb=new Scanner(System.in);
		String temporary="";
		System.out.println("Please give me a name for your hero: ");
		temporary=kb.next();
		return temporary;
	}//here ends updateName method

}//end of class