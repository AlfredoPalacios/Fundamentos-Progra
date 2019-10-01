import java.util.Scanner;
public class CalculatingFactorialsWhile{
	public static void main(String[]args){
		Scanner kb = new Scanner(System.in);
		int n = 0, res = 1;
		System.out.println("Input an integer number: ");
		n=kb.nextInt();
		while (n>0){
			res=res*n;
			n--;
		}
		System.out.println("Result is: " + res);
	}
}