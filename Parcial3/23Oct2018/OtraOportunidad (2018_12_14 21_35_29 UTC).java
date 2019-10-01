import java.util.Scanner;
public class OtraOportunidad{
    public static void main(String[]args){
        Scanner kb=new Scanner(System.in);
        String word;
        int size, counter;
        boolean isIt=false;
        System.out.println("Enter any word.");
        word=kb.next();
        size=word.length()-1;
        for(counter=0; counter<=size; counter++, size--){
            if(word.charAt(counter)==word.charAt(size)){
                isIt=true;
            }
            else
            isIt=false;
        }
        if(isIt){
            System.out.println("The word " + word + " is palindrome.");
        }
        else
        System.out.println("The word " + word + " isn't palindrome.");
    }
}
