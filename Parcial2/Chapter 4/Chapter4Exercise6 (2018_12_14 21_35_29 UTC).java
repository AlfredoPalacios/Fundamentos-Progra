import java.util.Scanner;
public class Chapter4Exercise6{
	/* Alfredo Palacios Olagaray
	17 September 2018
	Exercises Chapter 4 loops */
public static void main(String[]args){

	//declaring and initializing all variables
	int numberOfGrades = 0, grade = 0, A = 0, B = 0, C = 0, D = 0, F = 0;
	Scanner kb = new Scanner(System.in);

	//process
	System.out.println("Please input the grades in a scale from 0 to 100.");
	System.out.println("Use a negative number to mark the end of the list.");
	grade = kb.nextInt();

	while ((grade >= 0)&&(grade <= 100))
	{
		if ((grade >= 0)&&(grade <= 100))
		{
			numberOfGrades++;								//adds 1 to counter if grade is bigger than 0
			if ((grade >= 90)&&(grade <= 100))
			{
				A++;
			}
			else if ((grade >= 80)&&(grade <= 89))
			{
				B++;
			}
			else if ((grade >= 70)&&(grade <= 79))
			{
				C++;
			}
			else if ((grade >= 60)&&(grade <= 69))
			{
				D++;
			}
			else if ((grade >= 0)&&(grade <= 59))
			{
				F++;
			}
			else
			{
			System.out.println("Enter a number from 1 to 100 please.");
			}
		}
		grade = kb.nextInt();
	}
	System.out.println("Total number of grades: " + numberOfGrades);
	System.out.println("Number of A's: " + A);
	System.out.println("Number of B's: " + B);
	System.out.println("Number of C's: " + C);
	System.out.println("Number of D's: " + D);
	System.out.println("Number of F's: " + F);

}//here ends main method
}//here ends Exercise 6