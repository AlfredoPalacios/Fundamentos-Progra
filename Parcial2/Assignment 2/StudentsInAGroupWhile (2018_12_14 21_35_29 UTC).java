import java.util.*;
public class StudentsInAGroupWhile{
	/* Alfredo Palacios Olagaray
	   18 September 2018
	   Studens in a group heght for */
	public static void main(String[]args){

		//declaring and initializing all variables
		Scanner kb = new Scanner (System.in);
		int less160 = 0, between160and175 = 0, between176and180 = 0, more180 = 0, height = 0, numberOfStudents = 0;

		//process
		while (height != -99)									//if input is -99, loop ends
		{
			System.out.println("Tell me the students height in cm:");
			height = kb.nextInt();								//sets height to user input
			if (height !=  -99)
			{
				if (height < 160)
				{
					less160++;									//sums 1 to less150 if the random number is less than 150
				}
				if ((height >= 160)&&(height <= 175))
				{
					between160and175++;							//sums 1 to between150and165 if rand is between 150 and 165
				}
				if ((height >= 176)&&(height <= 180))
				{
					between176and180++;							//sums 1 to between166and180 if rand is between 166 and 180
				}
				if (height > 180)
				{
					more180++;									//sums 1 to more180 if rand is greater than 180
				}
				numberOfStudents++;								//adds 1 to the number of students each iteration
			}//end of if
			System.out.println("If you entered the last height or want to stop, enter a \"-99\".\n");
		}//end of loop
			System.out.println("The number of students that are less than 160 is: \t\t" + less160);
			//prints the number of students that measure less than 160cm
			System.out.println("The number of students that are between 160 and 175 is: \t" + between160and175);
			//prints the number of students that measure between 160 and 175cm
			System.out.println("The number of students that are between 176 and 180 is: \t" + between176and180);
			//prints the number of students that measure between 176 and 180cm
			System.out.println("The number of students that are more than 180 is: \t\t" + more180);
			//prints the number of students that measure more than 180cm
			System.out.println("The total number of students is: \t\t\t\t" + numberOfStudents);
			//prints the number of students


	}//here ends main method
}//here ends Students in a group