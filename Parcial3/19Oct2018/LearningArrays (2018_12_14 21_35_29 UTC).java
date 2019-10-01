
import java.util.Scanner;
/*
	Alfredo Palacios Olagaray
	19 October 2018
	My first Array that stores 5 numbers
*/
public class LearningArrays{
	public static void main(String[]args) {

		//constants
		final int SIZE=5;

		//local variables
		Math
		int counter;
		int whereTo=0, value=0;
		Scanner kb=new Scanner(System.in);

		//Array declaration
		int[]listNumber=new int[SIZE];
		//int[]listNumber; (Declaration)--> listNumber=new int[5]; (creation once size is known)(can be donde this way too)

		//
		//print one position from my array
		//System.out.println(listNumber[2]); only orks if I know what position I want to print
		//

		//print the complete array
		for(counter=0; counter<listNumber.length; counter++){
			System.out.println(listNumber[counter]); //prints the whole array
		}//end of for

		//how to store data in my array only if I know the position where I want to store the value
		System.out.println("Please tell me where to store data and the value to store. Position you want must be " + SIZE + "-1.");
		whereTo=kb.nextInt();
		value=kb.nextInt();
		listNumber[whereTo]=value; //or listN...To]=kb.nextInt();
		for(counter=0; counter<listNumber.length; counter++){
			System.out.println(listNumber[counter]);
		}

		//to change values of all data in my array
		for(counter=0; counter<SIZE; counter++){
			System.out.println("New value for position " + counter);
			listNumber[counter]=kb.nextInt();
		}
		for(counter=0; counter<listNumber.length; counter++){
			System.out.println(listNumber[counter]);
		}

	}//main end
}//LearningArrays ends
