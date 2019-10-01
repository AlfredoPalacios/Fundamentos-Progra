import java.util.Scanner;
public class PrepExam{
  public static void main(String[]args){
    Scanner kb = new Scanner(System.in);
    String number="", response="";
    boolean capi=false;

    //process
    do{
      System.out.println("Enter any integer number.");
      number=kb.next();
      capi=capiOrNot(number);
      if(capi==true){
        System.out.println("The number " + number + " is capicúa.");
      }
      else
      System.out.println("The number " + number + " isn't capicúa.");
      System.out.println("Do you want to evaluate another number? Yes or no.");
      response=kb.next();
    }
    while(response.equalsIgnoreCase("yes"));

  }//here ends main method

public static boolean capiOrNot(String theNumber){

  int size=0, counter=0;
  boolean temp=false;
  String newNumber="";

  size=theNumber.length()-1;
  for (counter=size; counter>=0; counter--){
    newNumber+=theNumber.charAt(counter);
  }//end of for loop
  if(newNumber.equals(theNumber))
  temp=true;
  else
  temp=false;
  return temp;

}//here ends capiOrNot method

}//here ends PrepExam
