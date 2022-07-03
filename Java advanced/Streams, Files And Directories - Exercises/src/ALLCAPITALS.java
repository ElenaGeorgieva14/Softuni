import java.io.*;
import java.util.Locale;

public class ALLCAPITALS {
    public static void main(String[] args) {

        String path="C:\\Users\\Lenovo\\OneDrive\\Documents\\Softuni\\Softuni\\Java advanced\\Streams, Files And Directories - Exercises\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";

        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            PrintWriter printWriter=new PrintWriter("output.txt");

            String line=br.readLine();
            while(line != null){
                printWriter.println(line.toUpperCase(Locale.ROOT));
                line=br.readLine();
            }
            br.close();
            printWriter.close();
        } catch (FileNotFoundException e) {
            System.out.println("File doesn't exist");
        } catch (IOException e) {
            System.out.println("File is empty");
        }
    }
}
