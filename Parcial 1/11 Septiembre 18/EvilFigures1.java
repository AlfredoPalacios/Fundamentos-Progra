public class EvilFigures1{
	/* Alfredo Palacios Olagaray
	   11 September 2018
	   Printing Stars */
public static void main(String[]args){

	//declaring and initializing all variables
	int counter = 0, lim = 0;
	String figure = "*";

	//process
	for(lim = 8; lim > 0; lim--)
	{
		for(counter = 0; counter < lim; counter++)
		{
		System.out.print(figure);
		}
		System.out.println();
	}//here ends for
}//here ends main method
}//here ends Printing Stars