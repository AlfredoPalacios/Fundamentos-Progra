import java.util.Scanner;
public class PrimeNumbersAnswer{
	public static void main(String[]args){

		//Declaring and initializing all variables
		Scanner kb = new Scanner(System.in);
		int num = 0, counter = 0, control=0, div2=0;

		//process
		System.out.println("Enter any number.");
		num=kb.nextInt();
		div2=num/2;
		for(counter=2; counter<=div2; counter++){
			if(num%counter==0){
				System.out.println("no");
				control=1;
				break;
			}
        }//end of for
		if(control==0)
		System.out.println("yes");
	}
}
