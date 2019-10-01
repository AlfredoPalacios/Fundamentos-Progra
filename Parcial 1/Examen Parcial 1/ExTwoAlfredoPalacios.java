import java.util.Scanner;
public class ExTwoAlfredoPalacios{
	/* Alfredo Palacios Olagaray
	   4 September 2018
	   Partial 1 exam */
public static void main(String[]args){
	String winds = "", clouds = "";
	Scanner kb = new Scanner(System.in);
	System.out.println("I'll tell you today's weather");
	System.out.println("If you feel winds, input yes or no. If you see clouds input yes or no. Please separate them with a space.");
	winds = kb.next();
	clouds = kb.next();
	if ((winds.equalsIgnoreCase("no"))&&(clouds.equalsIgnoreCase("no")))
	System.out.println("It's gonna be a sunny day");
	else if ((winds.equalsIgnoreCase("no"))&&(clouds.equalsIgnoreCase("yes")))
	System.out.println("It's gonna be a cloudy day");
	else if ((winds.equalsIgnoreCase("yes"))&&(clouds.equalsIgnoreCase("no")))
	System.out.println("It's gonna be a windy day");
	else if ((winds.equalsIgnoreCase("yes"))&&(clouds.equalsIgnoreCase("yes")))
	System.out.println("It's gonna be a rainy day");
	else
	System.out.println("I don't understand you");
}//here ends main method
}//here ends ExTw