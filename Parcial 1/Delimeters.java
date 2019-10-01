import java.util.Scanner;
public class Delimeters{
	public static void main(String[]args){
		Scanner kb = new Scanner(System.in);
		kb.useDelimiter("#");
		String word1, word2, word3;
		System.out.println("Enter a line of 3 words delimited by #");
		word1 = kb.next();
		word2 = kb.next();
		word3 = kb.next();
		System.out.println("The words are: \"" + word1 + "\", \"" + word2 + "\" and \"" + word3 + "\"");
	}
}