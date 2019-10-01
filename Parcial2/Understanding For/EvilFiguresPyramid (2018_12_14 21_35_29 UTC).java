import java.util.Scanner;
public class EvilFiguresPyramid{
	/* Alfredo Palacios Olagaray
	   20 September 2018
	   Printiing a pyramid of stars */
	public static void main(String[]args){

		//declaring and initializing all variables
		Scanner kb = new Scanner (System.in);
		int counterCol = 0, counterRow = 0, size = 0;
		String response = " ";
		final String FIGURE = "*";

		//process
		do{
			System.out.println("How big do you want the pyramid to be?");
			size = kb.nextInt();
			for (counterCol = size; counterCol >= 1; counterCol--){
				for (counterRow = counterCol; counterRow > 1; counterRow--){
					System.out.print(" ");
				}
				for (counterRow = 1; counterRow <= (size-counterCol)+1 ; counterRow++){
					System.out.print(FIGURE + " ");
				}
				System.out.println();
			}
			System.out.println("Do you want to print another pyramid?");
			response = kb.next();
		}
		while(response.equalsIgnoreCase("yes"));

	}//here ends main method
}//here ends Evil Figures Pyramid