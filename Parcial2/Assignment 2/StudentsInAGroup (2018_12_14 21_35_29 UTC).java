import java.util.Random;
public class StudentsInAGroup{
	/* Alfredo Palacios Olagaray
	   18 September 2018
	   Studens in a group heght for */
	public static void main(String[]args){

		//declaring and initializing all variables
		Random rand = new Random();						//gets everything set to give a random number
		int less150 = 0, between150and165 = 0, between166and180 = 0, more180 = 0, counter = 1, height = 0;

		//process
		for (counter = 0; counter < 197; counter++)			//sets counter to 1, the condition to counter less than 197 and sums
															//1 to counter each iteration
		{
			height = rand.nextInt(150)+100;					//gives a random number between 0 and 150, and sums 100 to it, to
															//set the parameter to numbers between 100 and 250
															//(max and min heights I established)
			if (height < 150)
			{
				less150++;									//sums 1 to less150 if the random number is less than 150
			}
			if ((height >= 150)&&(height <= 165))
			{
				between150and165++;							//sums 1 to between150and165 if rand is between 150 and 165
			}
			if ((height >= 166)&&(height <= 180))
			{
				between166and180++;							//sums 1 to between166and180 if rand is between 166 and 180
			}
			if (height > 180)
			{
				more180++;									//sums 1 to more180 if rand is greater than 180
			}
		}
		System.out.println("The number of students that are less than 150 is: \t\t" + less150);					//prints the number of students that measure less than 150cm
		System.out.println("The number of students that are between 150 and 165 is: \t" + between150and165);	//prints the number of students that measure between 150 and 165cm
		System.out.println("The number of students that are between 166 and 180 is: \t" + between166and180);	//prints the number of students that measure between 166 and 180cm
		System.out.println("The number of students that are more than 180 is: \t\t" + more180);					//prints the number of students that measure more than 180cm
		System.out.println("The total number of students is: \t\t\t\t" + counter);								//prints the number of students

	}//here ends main method
}//here ends Students in a group