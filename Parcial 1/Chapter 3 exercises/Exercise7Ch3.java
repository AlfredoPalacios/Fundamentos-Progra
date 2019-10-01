public class Exercise7Ch3{
	/* Alfredo Palacios Olagaray
	   1 November 2018
	   Book Exercise 7 Chapter 3 */
public static void main(String[]args){
	int x = 5, y = 10, z = 15;
	if (x < 5 && y > x)
	   System.out.println("(x < 5 && y > x) is true.");
	else
	   System.out.println("(x < 5 && y > x) is false.");
	if (x < 5 || y > x)
	   System.out.println("(x < 5 || y > x) is true.");
	else
	   System.out.println("(x < 5 || y > x) is false.");
	if (x > 3 || y < 10 && z == 15)
	   System.out.println("(x > 3 || y < 10 && z == 15) is true.");
	else
	   System.out.println("(x > 3 || y < 10 && z == 15) is false.");
	if (! (x > 3) && x != z || x + y == z)
	   System.out.println("(! (x > 3) && x != z || x + y == z) is true.");
	else
	   System.out.println("(! (x > 3) && x != z || x + y == z) is false.");
}//here ends main method
}//here ends Exercise 7