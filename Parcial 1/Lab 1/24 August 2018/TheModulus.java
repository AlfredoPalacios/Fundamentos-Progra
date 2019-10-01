public class TheModulus{
/* Author: Alfredo Palacios Olagaray
   ** 24 August 2018
   ** Using mod operator */
public static void main(String[]args){
	//variable declaration
	int aNumber = 0, result = 0;
	String veryLongLegend = "";

	aNumber = 1004;
	result = aNumber%2;

	//System.out.println(result);
	//System.out.println(result==0?"even number":"odd number");

	veryLongLegend = result==0?"even number":"odd number";
	//System.out.println(veryLongLegend);

	System.out.println("\tAfter evaluating "  + aNumber + "\n \tthe result was "
	+ aNumber + " is an " + veryLongLegend);

}// main method ends here
}//here ends using mod operator