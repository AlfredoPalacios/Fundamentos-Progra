import java.util.Scanner;
public class CodeMySecretFor {

    public static String text;

    public static void main(String[]args){

        Scanner kb=new Scanner(System.in);
        int size, counter;
        String theLetter, ns, replacement, finalsent;
        System.out.println("Sentence: ");
        text=kb.nextLine();
        size= text.length()-1;
        System.out.println("First letter: ");
        theLetter=kb.next();
        System.out.println("Replacement: ");
        replacement=kb.next();
        finalsent=replacing(theLetter.charAt(0), replacement.charAt(0));
        if(text.charAt(counter)==theLetter)
            ns=ns+replacement;
        else
            ns=ns+text.charAt(counter);
    }
    public static String replacing(char theLetter, char replacement){

    }
}
