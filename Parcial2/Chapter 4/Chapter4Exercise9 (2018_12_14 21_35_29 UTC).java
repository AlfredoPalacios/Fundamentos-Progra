import java.util.Random;
import java.util.Scanner;
public class Chapter4Exercise9{
	/* Alfredo Palacios Olagaray
	17 September 2018
	Exercises Chapter 4 loops */
public static void main(String[]args){

	//declaring and initializing all variables
	Scanner kb = new Scanner(System.in);
	int number = (int) (Math.random() * 4) + 1;
	String response = " ";

	//process
	System.out.println("I will tell you wat´s for dinner. Sit back, relax, and enjoy your food.");
	System.out.println("\nI will generate a random number between 1 and 4. Watch the magic.");
	System.out.println("\nEnter \"Yes\" if you wanna see the magic. Enter \"No\" if ypu don't.");
	System.out.println("\n(Even though I don't see why you would say no)");
	response = kb.next();
	if (response.equalsIgnoreCase("yes"))
	{
		System.out.println("\nThe number is: " + number);
		if ((number == 1)||(number == 2))
		{
		System.out.println("Pizza");
		}
		else if (number == 3)
		{
		System.out.println("Bibimbap");
		}
		else
		{
		System.out.println("Couscous");
		}
	}
	else
	System.out.println("Ok then, see you around...    :(");

}//here ends main method
}//here ends Exercise 9