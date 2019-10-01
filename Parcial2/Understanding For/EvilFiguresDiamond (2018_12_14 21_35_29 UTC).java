import java.util.Scanner;
public class EvilFiguresDiamond{
	/* Alfredo Palacios Olagaray
	   20 September 2018
	   Printiing a pyramid of stars */
	public static void main(String[]args){

		//declaring and initializing all variables
		Scanner kb = new Scanner (System.in);
		int counterCol = 0, counterRow = 0, size = 0, spaceCount = 0;
		String response = " ";
		final String FIGURE = "*";
		final String SPACE = " ";

		//process
		do{
			System.out.println("How big do you want the diamond to be?");
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
			for (counterCol = size; counterCol > 1; counterCol--){
				for (counterRow = counterCol; counterRow > 1; counterRow--){
					System.out.print(" " + FIGURE);
				}
				for (counterRow = 1; counterRow <= (size-counterCol)+1; counterRow++){
					System.out.print(SPACE);
					}
					System.out.println();
				for (spaceCount = (size-(counterRow-1)); spaceCount < size; spaceCount++){
					System.out.print(SPACE);
				}
			}
			System.out.println("Do you want to print another diamond?");
			response = kb.next();
		}
		while(response.equalsIgnoreCase("yes"));

	}//here ends main method
}//here ends Evil Figures Pyramid