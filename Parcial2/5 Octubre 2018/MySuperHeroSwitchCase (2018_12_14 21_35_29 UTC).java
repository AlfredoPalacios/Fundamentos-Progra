import java.util.*;
/*  Alfredo Palacios Olagaray
	5 October 2018
	Write a bunch of methods to practice */
public class MySuperHeroSwitchCase{

	//instance variables
	public static String name = "";			//instance variable

	public static void main(String[]ars){

		//variables declaration
		Scanner kb=new Scanner(System.in);
		int life=100;						//local variable
		String theGolpe="";

		//printName();
		name=updateName();
		//printName();
		System.out.println("Please enter \"strong\", \"medium\" or \"low\" depending on the punch your hero recieved.");
		theGolpe=kb.next().toLowerCase();
		printStats(life);
		life=lifeLevel(theGolpe,life);
		printStats(life);
	}//end of main method

	public static int lifeLevel(String punchType, int theLife){
		int temp=0;
		/*
		if(punchType.equalsIgnoreCase("strong")){
			temp=theLife-20;
			}*/
		switch (punchType){
			case"strong":temp=theLife-20;
			break;
			case"medium":temp=theLife-15;
			break;
			case"low":temp=theLife-5;
			break;
			default:temp=theLife;
			break;
		}//here ends switch
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