import java.util.Scanner;
public class CalculatingFactorialsFor{
	public static void main(String[]args){
		Scanner kb=new Scanner(System.in);
		int n=0, counter=0, res=1;
		System.out.println("Input an integer number:");
		n=kb.nextInt();
		for(counter=n; counter>0; counter--){
			res=res*n;
			n--;
		}
		System.out.println("Result: " + res);
	}
}