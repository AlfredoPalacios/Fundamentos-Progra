import java.util.Scanner;
public class ProgrammingProject3{
	/* Alfredo Palacios Olagaray
	17 September 2018
	Exercises Chapter 4 loops */
public static void main(String[]args){

	//declaring and initializing all variables
	Scanner kb = new Scanner(System.in);
	double accountA = 0, accountM = 0, accountD = 0, balance = 0, interestRate = 0, counter = 1;
	String response = " ";

	//process
	System.out.println("I'm here to help you. Do you want to calulate stuff for an account? Yes or no.");
	response = kb.next();

	while (response.equalsIgnoreCase("yes"))
	{
		System.out.println("Please enter current balance: ");
		balance = kb.nextDouble();
		System.out.println("Please enter the interest rate: ");
		interestRate = kb.nextDouble();
		for (counter = 1; counter <= 10; counter++)
		{
			if (counter == 1)
			{
			accountA = balance + (balance * ((interestRate/1)*.01));
			}
			else
			{
			accountA += (balance * ((interestRate/1)*.01));
			}
		}
		for (counter = 1; counter <= 120; counter++)
		{
			if (counter == 1)
			{
			accountM = balance + (balance * ((interestRate/12)*.01));
			}
			else
			{
			accountM += (balance * ((interestRate/12))*.01);
			}
		}
		for (counter = 1; counter <= 3650; counter++)
		{
			if (counter == 1)
			{
			accountD = balance + (balance * ((interestRate/365)*.01));
			}
			else
			{
			accountD += (balance * ((interestRate/365)*.01));
			}
		}
		System.out.println("The balance of the account after 10 years with: ");
		System.out.println("An interest rate of: " + interestRate);
		System.out.println("And an initial balance of: " + balance);
		System.out.println("Is:\n");
		System.out.println("Annually: " + accountA);
		System.out.println("Monthly: " + accountM);
		System.out.println("Daily: " + accountD);
		System.out.println("Do you wish to calculate the same stuff for another account? Yes or no.");
		response = kb.next();
	}

}//here ends main method
}//here ends Programming Project 3