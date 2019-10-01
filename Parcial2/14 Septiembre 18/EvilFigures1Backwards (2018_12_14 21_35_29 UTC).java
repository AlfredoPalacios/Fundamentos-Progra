public class EvilFigures1Backwards{
	/* Alfredo Palacios Olagaray
	   11 September 2018
	   Printing Stars */
public static int SIZEX = 10;
public static int SIZEY = 10;

public static void main(String[]args){

	//declaring and initializing all variables
	int x = 0, y = 0;
	String figure = "*";

	//process
	for(y = 0; y < SIZEY; y++)
	{
		for(x = 0; x < y; x++)
		{
		System.out.print(figure);
		}
		System.out.println();
	}//here ends for
	System.out.println();
}//here ends main method
}//here ends Printing Stars