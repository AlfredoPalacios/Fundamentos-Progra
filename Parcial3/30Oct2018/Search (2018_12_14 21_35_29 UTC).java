import java.util.Scanner;
/*
	Alfredo Palacios Olagaray
	30 October 2018
	Learning to use search
*/
public class Search{

	//public static String[]name=new String[5];
	public static String[]name={"zanahoria","lechuga","pepino","alcachofa","espinaca"};
	//public static int[]value=new int[5];
	public static int[]value={1,2,3,4,5};

	public static void main(String[]args){

		int whereIsIt=-1;

		whereIsIt=search("alcachofa");
		System.out.println("Your product is at " + whereIsIt);

	}//end main method

	public static int search(String what){

		int where=-1, counter;

		for(counter=0; counter<name.length; counter++){

			if(name[counter].equalsIgnoreCase(what)){
				where=counter;
				break;
			}//end if

		}//end for

		return where;

	}//end search method

}//end all