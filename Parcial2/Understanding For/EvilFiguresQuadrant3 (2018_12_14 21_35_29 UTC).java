import java.util.Scanner;
public class EvilFiguresQuadrant3{
	/* Alfredo Palacios Olagaray
	   20 September 2018
	   Printing Stars with quadrants */
	public static void main(String[]args){

		//declaring and initializing all variables
		Scanner kb = new Scanner (System.in);
		int counterCol = 0, counterRow = 0, size = 0;
		String response = " ";

		//process
		do{
			System.out.println("How big do you want each quadrant to be?");
			size = kb.nextInt();
			for (counterCol = 1; counterCol <= size; counterCol++){
				for(counterRow = 1; counterRow <= counterCol; counterRow++){
						System.out.print("* ");
				}
				System.out.println();
			}
			System.out.println();
			System.out.println("Do you want to print the same quadrant with another size?");
			response = kb.next();
		}
		while (response.equalsIgnoreCase("yes"));
	}//here ends main method
}//here ends Printing Stars of Quadrant 3