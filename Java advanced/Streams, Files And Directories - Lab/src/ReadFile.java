import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {
        String path="C:\\Users\\Lenovo\\OneDrive\\Documents\\Softuni\\Softuni\\Java advanced\\Streams, Files And Directories - Lab\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
       
        try {
            FileInputStream fileStream = new FileInputStream(path);
            int oneByte=fileStream.read();

            while(oneByte>=0){
                System.out.printf("%s ",Integer.toBinaryString(oneByte));

                oneByte=fileStream.read();
            }

        }catch (FileNotFoundException ex){
            System.out.println("This file doesn't exist!");
        } catch (IOException e) {
            System.out.println("This file is empty");
        }


    }
}
