import java.util.Scanner;
/*  Alfredo Palacios Olagaray
	16 October 2018
	Program that tells if a number is capic�a of not. */
public class CapiAlfredo{
	public static void main(String[]args){

		//local variables
		Scanner kb=new Scanner(System.in);
		String number="", response="";
		boolean capiOrNot=false;

		//process
		do{
			System.out.println("Give me an integer number.");							//asks for the number

			number=kb.next();															//stores the given number in the variable number

			capiOrNot=capicuaOrNot(number);												//invokes capicuaOrNot method
																						//and stores the returned boolean value in
																						//the variable capiOrNot

			if(capiOrNot==true){														//starts the if to evaluate wether returned
																						//value is true or not

			System.out.println("The number " + number + " is capic�a.");				//prints this if it is a capic�a
			}
			else if(capiOrNot==false){													//prints this if it is not a capic�a
			System.out.println("The number " + number + " isn't capic�a.");
			}
			System.out.println("Do you want to evaluate another number? Yes or enter whatever you want besides yes for a no.");
			//asks the user if it wants to evaluate a new number
			response=kb.next();															//stores the answer in variable response
		}
		while(response.equalsIgnoreCase("yes"));										//condition for the loop to do another iteration

	}//here ends main method

	public static boolean capicuaOrNot(String theNumber){								//method to determine if it is capi or not

		//more local variables
		int counter=0, size=0;
		String newNumber="";
		boolean yesOrNo=false;

		//process to determine wether it's capic�a or not
		size=theNumber.length()-1;							//-1 to prevent run-time error
		for(counter=size; counter>=0; counter--){			//for loop to reverse the number
			newNumber+=theNumber.charAt(counter);			//builds the number backwards
		}//end of for loop
		if(newNumber.equals(theNumber)){					//if to evaluate if the given number and the new number are equal
			yesOrNo=true;									//sets yesOrNo to true if numbers are equal
		}
		else{
			yesOrNo=false;									//sets yesOrNo to false if numbers aren't equal
		}
		return yesOrNo;										//returns boolean

	}//here ends capicuaOrNot method

}//here ends CapiAlfredo
