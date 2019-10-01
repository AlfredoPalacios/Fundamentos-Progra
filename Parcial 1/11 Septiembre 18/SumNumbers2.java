import java.util.Scanner;
public class SumNumbers2{
	/* Alfredo Palacios Olagaray
	   11 September 2018
	   Sum of numbers until user enters 0 */
public static void main(String[]args){

	//declaring and initializing all variables
	Scanner kb = new Scanner(System.in);
	int number = 0, sum = 0;

	//process
	System.out.println("Please enter the numbers you want to sum.");
	System.out.println("To stop the sum, enter a zero");
	number = kb.nextInt();
	sum += number;
	while (number != 0)
	{
		number = kb.nextInt();
		sum += number;
	}//while ends
	System.out.println("The sum is: " + sum);
}//here ends main method
}//Here ends Sum Numbers 2