import java.util.Scanner;
public class Exercise3Ch3{
	/* Alfredo Palacios Olagaray
	   31 August 2018
	   Book Chapter 3 Exercise 3 */
public static void main(String[]args){
	Scanner kb = new Scanner(System.in);
	String accept = "";
	System.out.println("Yes or no? Type in your answer: ");
	accept = kb.next();
	if (accept.equalsIgnoreCase("yes"))
	System.out.println("True");
   else if (accept.equalsIgnoreCase("no"))
   System.out.println("False");
   else
   System.out.println("Please enter yes or no");
}//here ends main method
}//here ends Exercise3