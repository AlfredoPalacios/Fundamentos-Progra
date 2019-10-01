import java.util.Scanner;
public class Chapter4Exercise7{
	/* Alfredo Palacios Olagaray
	17 September 2018
	Exercises Chapter 4 loops */
public static void main(String[]args){

	//declaring and initializing all variables
	Scanner kb = new Scanner(System.in);
	int numberOfGrades = 0, grade = 0, A = 0, B = 0, C = 0, D = 0, F = 0, lowestGrade = 0, highestGrade = 0, sum = 0;
	double average = 0.0;

	//process
	System.out.println("Please input grades in a scale from 0 to 100.");
	System.out.println("Use a negative number to mark the end of the list.");
	grade = kb.nextInt();

	while ((grade >= 0)&&(grade <= 100))
	{
		sum += grade;						//makes the sum each iteration
		numberOfGrades++;					//serves as the counter
		if (numberOfGrades == 1)			//checks if it is the first iteration
		{
			lowestGrade = grade;			//sets value of the lowest grade
		}
		if (grade > highestGrade)			//checks if grade is the biggest number
		{
			highestGrade = grade;			//if it is, it changes the value of highestGrade to grade
		}
		if ((grade < lowestGrade)&&(grade >= 0))//checks if grade is the smallest number, but still positive
		{
			lowestGrade = grade;			//if it is, it changes the value of lowestGrade to grade
		}
		if ((grade >= 90)&&(grade <= 100))	//checks of grade is between 100 and 90
		{
			A++;							//if it is, it adds 1 to the number of A's
		}
		else if ((grade >= 80)&&(grade <= 89))//checks if grade is between 89 and 80
		{
			B++;							//if it is, it adds 1 to the number of B's
		}
		else if ((grade >= 70)&&(grade <= 79))//checks if grade is between 79 and 70
		{
			C++;							//if it is, it adds 1 to the number of C's
		}
		else if ((grade >= 60)&&(grade <= 69))//checks if grade is between 69 and 60
		{
			D++;							//if it is, it adds 1 to the number of D's
		}
		else if ((grade >= 0)&&(grade <= 59))//checks if grade is between 59 and 0
		{
			F++;							//if it is, it adds 1 to the number of F's
		}
		else								//if grade is higher than 100 (wouldn't do the loop, though)
		{
		System.out.println("Enter a number from 1 to 100 please.");
		}
		grade = kb.nextInt();				//changes value of grade
	}
		System.out.println("Total number of grades: " + numberOfGrades);								//prints number of grades
		System.out.println("Number of A's: " + A + " \t Or " + ((A*100)/numberOfGrades) + "% of A's."); //prints number of A's and percentage
		System.out.println("Number of B's: " + B + " \t Or " + ((B*100)/numberOfGrades) + "% of B's."); //prints number of B's and percentage
		System.out.println("Number of C's: " + C + " \t Or " + ((C*100)/numberOfGrades) + "% of C's."); //prints number of C's and percentage
		System.out.println("Number of D's: " + D + " \t Or " + ((D*100)/numberOfGrades) + "% of D's."); //prints number of D's and percentage
		System.out.println("Number of F's: " + F + " \t Or " + ((F*100)/numberOfGrades) + "% of F's."); //prints number of F's and percentage
		average = (double)sum/(double)numberOfGrades;													//gets the final average
		System.out.println("Highest grade is; " + highestGrade + ". Congrats. Keep up the good work."); //prints highest grade
		System.out.println("Lowest grade is: " + lowestGrade + ". Needs to study harder.");				//prints lowest grade
		System.out.println("The average is: " + average);												//prints the average
		System.out.println("You summed a total of " + numberOfGrades + " grades.");						//prints the number of grades that were summed

}//here ends main method
}//here ends Exercise 7