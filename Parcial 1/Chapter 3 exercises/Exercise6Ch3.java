public class Exercise6Ch3{
	/* Alfredo Palacios Olagaray
	   31 August 2018
	   Book Chapter 3 Exercises */
public static void main(String[]args){
	double check = 10000;

	if (check<=10)
	   System.out.println("Service charge is 1 dollar.");
	else if ((check>10)&&(check<=100))
	   System.out.println("Service charge is: " + (check - (check * .9)) + " dollars.");
	else if ((check>100)&&(check<=1000))
	   System.out.println("Service charge is: " + ((check - (check * .95)) + 5) + " dollars.");
	else if (check>1000)
	   System.out.println("Service charge is: " + ((check - (check * .99)) + 40) + " dollars.");
	else
	   System.out.println("Input a valid number.");
}//here ends main method
}//here ends Exercise 6