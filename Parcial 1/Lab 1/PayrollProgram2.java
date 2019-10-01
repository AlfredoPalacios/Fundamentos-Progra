public class PayrollProgram2{
	/* Author: Alfredo Palacios Olagaray
	   Date: 21 August 2018
	   Description: Fist lab class */
public static void main(String[]args){
	long hoursWorked;
	double payRate, taxRate;
	hoursWorked = 20;
	payRate = 15;
	taxRate = 0.15;
	System.out.println("Hours Worked: " + hoursWorked);
	System.out.println("pay Amount: " + (hoursWorked * payRate));
	System.out.println("tax Amount: " + (hoursWorked * payRate * taxRate));
}//here ends main method
}//here ends exercise 1