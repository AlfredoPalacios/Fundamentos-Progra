import java.util.Scanner;
public class SumNumbers3{
	/* Alfredo Palacios Olagaray
	   11 September 2018
	   Sum of numbers until user enters 0 */
public static void main(String[]args){

	//declaring and initializing all variables
	Scanner kb = new Scanner(System.in);
	int number = 0, sum = 0, counter = 1;
	int oneMore = 1;

	//process
	while (oneMore != 0)
	{
	System.out.println("\n\nPlease give me number " + counter + ": ");
	number = kb.nextInt();
	sum += number;
	System.out.println("To stop the sum, enter a zero");
	oneMore = kb.nextInt();
	counter++;
	//counter += 1;				same as the one above
	//counter = counter + 1;	same as the one above
	}//while ends
	System.out.println("\n\tThe sum is: " + sum);
}//here ends main method
}//Here ends Sum Numbers 2