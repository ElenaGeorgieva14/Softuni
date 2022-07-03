import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SumBytes {
    public static void main(String[] args) {
        String path="C:\\Users\\Lenovo\\OneDrive\\Documents\\Softuni\\Softuni\\Java advanced\\Streams, Files And Directories - Exercises\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        long sum=0;

        try{
            BufferedReader br=new BufferedReader(new FileReader(path));
            String line=br.readLine();

            while(line != null){
                for (int i = 0; i < line.length(); i++) {
                    sum+=(int) line.charAt(i);
                }

                line=br.readLine();
            }

        } catch (FileNotFoundException e) {
            System.out.println("File doesn't exist");
        } catch (IOException e) {
            System.out.println("File is empty");
        }

        System.out.println(sum);

    }
}
