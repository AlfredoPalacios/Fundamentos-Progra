import java.io.File;
import java.util.Scanner;
public class Filesss{

    public static String[][]matrix;
    public static String fileName="nombres.csv";
    public static File file=new File(fileName);
    public static Scanner s;

    public static void main(String[] args) {
        readFile();
        System.out.println(getRowsNumber());
        System.out.println(getColumnsNumber());
    }

    public static String[][] readFile() {

        matrix=new String[getRowsNumber()][getRowsNumber()];
        try{
            s=new Scanner(file);
            while(s.hasNext()){
                System.out.println(s.nextLine());
            }
        } catch (Exception e){
            System.out.println("error");
        }
        s.close();
        return null;

    }//termina readFile

    public static int getRowsNumber(){

        int count=0;
        try{
            s=new Scanner(file);
            while(s.hasNext()){
                s.nextLine();
                count++;
            }//termina try
        }catch (Exception e){

        }//termina catch
        s.close();
        return count;

    }//termina getRowsNumber

    public static int getColumnsNumber(){

        String []arrayOfStrings;
        String linea="";
        int counter=0;
        try{
            s=new Scanner(file);
            if(s.hasNext()){
                linea=s.nextLine();
                arrayOfStrings=linea.split(",");
                return arrayOfStrings.length;
        }//termina if
    }catch (Exception e){

        }//termina catch
        s.close();
        return 0;
    }//termina getColumnsNumber

}//termina Filesss
