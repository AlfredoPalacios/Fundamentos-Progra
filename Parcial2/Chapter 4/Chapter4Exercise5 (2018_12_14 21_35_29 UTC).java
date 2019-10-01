import java.util.Scanner;
public class Chapter4Exercise5{
	/* Alfredo Palacios Olagaray
	17 September 2018
	Exercises Chapter 4 loops */
public static void main(String[]args){

	//declaring and initializing all variables
	Scanner kb = new Scanner(System.in);
	int maxNum = 0, minNum = 0, num = 0, sum = 0, counter = 0;		//counter set to 1 because there is no zero numbers to sum
	double average = 0.0;

	//process
	System.out.println("Please input nonnegative numbers. At least 1.");
	System.out.println("Enter a negative number to finish the list.");
	num = kb.nextInt();

	while (num >= 0)
	{
		sum += num;					//makes the sum each iteration
		num = kb.nextInt();			//sets num to the value of the input
		if (num >= 0)
		{
			counter++;				//sums 1 to counter each time num >= 0
			if (counter == 1)
			{
				minNum = num;		//sets minNum to num because it is the only number that has been read
			}
			if (num > maxNum)
			{
				maxNum = num;		//sets value of maxNum to num if num is greater than stored value
			}
			if ((num < minNum)&&(num >= 0))
			{
				minNum = num;		//sets value of minNumb to num if num is less than stored value
			}
		}
	}
	counter++;
	System.out.println(counter);
	System.out.println(sum);
	average = (double)sum/(double)counter;			//gets the final average
	System.out.println("Biggest number is; " + maxNum);
	System.out.println("Smallest number is: " + minNum);
	System.out.println("The average is: " + average);
	System.out.println("You summed a total of " + counter + " numbers.");


}//here ends main method
}//here ends Exercise 5