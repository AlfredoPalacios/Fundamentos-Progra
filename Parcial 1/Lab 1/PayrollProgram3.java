public class PayrollProgram3{
	/* Author: Alfredo Palacios Olagaray
	   Date: 21 August 2018
	   Description: Fist lab class */
public static void main(String[]args){
	long hoursWorked;//removed "= 40" and didn't work. hoursWorked might not have been initialized
	double payRate   = 10.0, taxRate = 0.10;
	System.out.println("Hours Worked: " + hoursWorked);
	System.out.println("pay Amount; " + (hoursWorked * payRate));//removed pay Amount and works
	System.out.println("tax Amount: " + (hoursWorked * payRate * taxRate));
}//here ends main method
}//here ends exercise 1