import java.io.*;
/*
    Alfredo Palacios Olagaray
    2 November 2018
    Program to write a file
*/
public class WritingFiles{

    public static void main(String[] args)throws IOException {

        String outputFile="storeddata.txt";
        PrintWriter theOutput=new PrintWriter(outputFile);

        theOutput.println("Destinyyyyyyyyyyyyyyyyyyyyyy");
        theOutput.print("541 894561 4856498 561 651");

        theOutput.close();

    }

}
