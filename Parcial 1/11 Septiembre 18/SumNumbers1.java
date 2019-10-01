import java.util.Scanner;
public class SumNumbers1{
	/* Alfredo Palacios Olagaray
	   11 September 2018
	   Sum "n" numbers */
public static void main(String[]args){

	//declaring and initializing variables
	int counter = 0, amountOfNumbers = 0, sum = 0, number = 0;
	Scanner kb = new Scanner(System.in);

	//process
	System.out.println("Hello, please tell me how many numbers you want to sum.");
	System.out.println("It has to be an integer number.");
	amountOfNumbers = kb.nextInt();				//now I know how many numbers the user wants to sum.

	//System.out.println(amountOfNumbers);		checking if amountOfNumbers has a correct value.

	for(counter = 1; counter <= amountOfNumbers; counter++)
	{
		System.out.println("\nPlease enter number " + counter + ":");
		number = kb.nextInt();
		//sum = sum + number
		sum += number;							//this does the same as the one above
		System.out.println("The partial of the sum is: " + sum);
		System.out.println();
	}//here loop ends

	System.out.println();
	System.out.println("\tThe final result of the sum is: " + sum);

}//here ends main method
}//here ends Sum Numbers 1