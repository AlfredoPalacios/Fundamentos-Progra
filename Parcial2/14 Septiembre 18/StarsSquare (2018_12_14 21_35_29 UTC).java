public class StarsSquare{
	/* Alfredo Palacios Olagaray
	   11 September 2018
	   Printing Stars */
final static int SIZEX = 10;					//constant
final static int SIZEY = 10;
public static void main(String[]args){

	//declaring and initializing all variables
	int x = 0, y = 0;
	String figure = "*";

	//process
	for(y = 0; y < SIZEY; y++)
	{
		for(x = 0; x < SIZEX; x++)
		{
			System.out.print(figure);
		}//here ends for x
		System.out.println();
	}//here ends for y
	System.out.print("\n");
}//here ends main method
}//here ends Printing Stars