/*
    Alfredo Palacios Olagaray
    13 November 2018
    Using 2D Arrays
*/
import java.util.Scanner;
import javax.swing.JOptionPane;
public class ArrayDim{

    static int[][] myArray={{10,80,90,100,2},{19,4,8,40,73},{200,7,21,35,5},{400,0,-3,666,999}};

    public static void main(String[] args) {
        JOptionPane window=new JOptionPane();
        Scanner kb=new Scanner(System.in);
        int what=0;
        String coords="", kQuires="";
        kQuires=window.showInputDialog(null, "Pon el numero que quieres encontrar",
        "La primera", 3);
        what=Integer.parseInt(kQuires);
        //System.out.println(myArray[1][3]);
        //System.out.println("What number do you want to find?");
        //what=kb.nextInt();
        coords=find(what);
        //System.out.println(coords);
        window.showMessageDialog(null, "Lo encontré en: " + coords,
        "Ventana window", 1);
        System.exit(0);
    }//here ends main

    public static String find(int what){
        String res="";
        boolean foundIt=false;
        for (int y=0; y<myArray.length; y++) {
            for (int x=0; x<myArray[y].length; x++) {
                if(what==myArray[y][x]){
                    res+=y + "," + x;
                    foundIt=true;
                    break;
                }//end if
            }//end 2nd for
            if(foundIt)
            break;
        }//end 1st for
        return res;

    }//here ends find

}//here ends ArrayDim
