import java.util.Scanner;
public class ExOneAlfredoPalacios{
	/* Alfredo Palacios Olagaray
	   4 September 2018
	   Partial 1 exam */
public static void main(String[]args){
	Scanner kb = new Scanner(System.in);
	int number = 0;
	System.out.println("Input an integer number: ");
	number = kb.nextInt();
	if ((number%3) == 0)
	System.out.println("Your number is multiple of 3.");
	else
	System.out.println("Your number is not a multiple of three.");
}//here ends main method
}//here ends ExOne