
import java.util.*;
import java.io.*;

public class javaStudyTime {



public static void main(String[] args){

	//String trainning:
	String stringTest = "AbCdEf GhIjK";

	stringTest = stringTest.toUpperCase(); //It can be .toLowerCase();

	System.out.println(stringTest);

	int stringLength = stringTest.length();

	System.out.println(stringLength);

	char theChar = stringTest.charAt(0);

	System.out.println(theChar);

	//To check if a string contains something bigger than 1 char:

	System.out.println(stringTest.contains("ABC"));

	//To check where a char in a String is:

	System.out.println(stringTest.indexOf("B"));

	//To replace a character in a String:

	System.out.println(stringTest.replace(" ", "-"));

	//Make a numbero to a String:

	String doubleIt = String.valueOf(5.5);
	String integerIt = String.valueOf(8);

	//Make a string into a number:

	int theInteger = Integer.parseInt(integerIt);

	/*Scanner stuff:

	Scanner kb = new Scanner(System.in);

	int userValue = 0;

	System.out.println("Please enter something here:");
	userValue = kb.nextInt();

	System.out.println("You wrote: " + userValue);

	*/

	//Mathematic Stuff:

	double pi = Math.PI;

	System.out.println(pi);

	float floatTest = 0; //Initialize a varianble as a floating point. (Its just a less precise (32) Double)

	//Array Stuff:

	int[] arrayOfInts = new int[]{1,2,3};

	int[] anotherIntArray = new int[10];

	int[][] a2d = new int[][]{{1,2,3},{4,5,6},{7,8,9}};

	int[][] a2d2 = new int[3][3];

	//To print a 1 dimencion array:

	System.out.println(Arrays.toString(arrayOfInts));

	//To get the length if an array:

	System.out.println(anotherIntArray.length);
	System.out.println(a2d.length);

	}



}