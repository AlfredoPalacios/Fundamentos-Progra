public class Exercise2Ch3{
	/* Alfredo Palacios Olagaray
	   31 August 2018
	   Book Chapter 3 exercises */
public static void main(String[]args){
	int x = 101;

	if ((x%2)==0)
	{
		x = (x/2);
		System.out.println("X is even, so new value is: " + x);
	}//end if
	else
	{
	    x = ((x * 3) - 1);
	    System.out.println("X is odd, so new value is: " + x);
	}//end else
}//here ends main method
}//here ends exercise2