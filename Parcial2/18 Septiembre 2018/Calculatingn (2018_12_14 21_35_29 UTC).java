import java.util.Scanner;
public class Calculatingn{
	public static void main(String[]args){

		Scanner kb = new Scanner(System.in);
		int n = 0, result = 1;

		System.out.println("Please input an integer number to calculate n!");
		n = kb.nextInt();
		while(n>0){
			result=result*n;
			System.out.println(n + "! = " + n + "*" + (n-1) + "!");
			n=n-1;
		}
		System.out.println("0! = 1");
		System.out.println("The result of " + n + "!" + " is: " + result);
	}//here ends main method
}//here ends Calculating n!