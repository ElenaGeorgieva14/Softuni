import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SumLines {
    public static void main(String[] args) {

        String path="C:\\Users\\Lenovo\\OneDrive\\Documents\\Softuni\\Softuni\\Java advanced\\Streams, Files And Directories - Exercises\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";

        try{
         BufferedReader bufferedReader= new BufferedReader(new FileReader(path));
         String line=bufferedReader.readLine();

         while(line!=null){
             long sum=0;

             for (int i = 0; i < line.length(); i++) {
                 sum+=(int)line.charAt(i);
             }
             System.out.println(sum);
             line=bufferedReader.readLine();
         }

        } catch (FileNotFoundException e) {
            System.out.println("File doesn't exist");
        } catch (IOException e) {
            System.out.println("File is empty");
        }
    }
}
