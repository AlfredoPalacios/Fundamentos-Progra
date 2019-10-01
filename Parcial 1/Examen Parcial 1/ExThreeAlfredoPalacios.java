import java.util.Scanner;
public class ExThreeAlfredoPalacios{
	/* Alfredo Palacios Olagaray
	   4 September 2018
	   Partial 1 exam */
public static void main(String[]args){
	Scanner kb = new Scanner(System.in);
	char grades = ' ';
	String newGrades = String.valueOf(grades);
	System.out.println("I'll convert your letter grade into a number grade.");
	System.out.println("Please input your letter grade.");
	newGrades = kb.next();
	if (newGrades.equalsIgnoreCase("A"))
	System.out.println("Your new grade is 100.");
	else if (newGrades.equalsIgnoreCase("B"))
	System.out.println("Your new grade is 90.");
	else if (newGrades.equalsIgnoreCase("C"))
	System.out.println("Your new grade is 80.");
	else if (newGrades.equalsIgnoreCase("D"))
	System.out.println("Your new grade is 70.");
	else if (newGrades.equalsIgnoreCase("F"))
	System.out.println("Your new grade is 50. And you need to study more. Please.");
	else
	System.out.println("Please enter a letter grade a, b, c, d, or f.");
}//here ends main method
}//here ends ExThree