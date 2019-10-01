import java.util.Scanner;
public class CodeMySecret {

    public static String sentence="";

    public static void main(String[]args){

        //declaring variables
        Scanner kb=new Scanner(System.in);
        String letter="", letterReplace="", finalSentence="";
        int size=0;

        //process
        System.out.println("Please give me a sentence: ");
        sentence=kb.nextLine();
        System.out.println("Please give me the letter you want to replace: ");
        letter=kb.next();
        System.out.println("Please give me the new letter: ");
        letterReplace=kb.next();
        finalSentence=encode(letter.charAt(0), letterReplace.charAt(0));
        System.out.println("The final sentence is: " + finalSentence);

    }//here ends main method

    public static String encode(char letter, char letterReplace){
        String newSentence="";
        newSentence=sentence.replace(letter, letterReplace);
        return newSentence;
    }//here ends encode

}//here ends CodeMySecret