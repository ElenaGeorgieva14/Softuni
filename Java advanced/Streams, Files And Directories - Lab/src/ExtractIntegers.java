import java.io.*;
import java.util.Scanner;

public class ExtractIntegers {
    public static void main(String[] args) {

        String path="C:\\Users\\Lenovo\\OneDrive\\Documents\\Softuni\\Softuni\\Java advanced\\Streams, Files And Directories - Lab\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";

        try{

            Scanner scanner=new Scanner(new FileInputStream(path));
            PrintWriter out=new PrintWriter(new FileOutputStream("Integers.txt"));



            while(scanner.hasNext()){
               if(scanner.hasNextInt()){
                   out.println(scanner.nextInt());
               }

                scanner.next();
            }

         out.close();
        }catch(FileNotFoundException e){
            System.out.println("File doesn't exist");
        }
    }
}
