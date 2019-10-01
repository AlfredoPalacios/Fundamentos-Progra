import java.util.Scanner;
public class PrimeNumbersAlfredoPalacios{
	/* Alfredo Palacios Olagaray
	   21 September 2018
	   Tells the user if any given number is a prime number or not */
	public static void main(String[]args){

		//declaring and initializing all variables
		Scanner kb = new Scanner(System.in);
		int num = 0, counter = 0;
		boolean isPrime=true;

		//process
		System.out.println("Please enter any number and I'll tell you if it's prime or not.");
		num=kb.nextInt();
		for(counter=2; counter<num; counter++){
			if(num%counter==0){
				isPrime = false;
				System.out.println("The number isn't prime.");
				break;
			}
			else{
				System.out.println("The number is prime.");
			}
		}

	}//here ends main method
}//here ends Prime Numbers