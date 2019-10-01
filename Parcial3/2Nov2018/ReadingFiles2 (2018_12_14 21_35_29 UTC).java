/*
    Alfredo Palacios Olagaray
    2 November 2018
    Program to read files
*/
import java.util.*;
import java.io.*;//para tener acceso a la clase file
public class ReadingFiles2{
    public static void main(String[] args)throws IOException {

        //File archivo=new File("Numbers.txt");

        Scanner fromFile=null;

        try{
            fromFile=new Scanner(new File("Numbers.txt"));
        }//end of try

        catch(FileNotFoundException e){
            System.out.println("Sorry, there's no file named as you wrote it.");
            System.exit(0);
        }//end of catch

        while(fromFile.hasNextInt()){

            System.out.println(fromFile.nextInt());

        }//end of while

        fromFile.close();

    }//end of main method

}//end of ReadingFiles
