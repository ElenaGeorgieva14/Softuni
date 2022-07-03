import java.io.*;

public class LineNumbers {
    public static void main(String[] args){
        String path="C:\\Users\\Lenovo\\OneDrive\\Documents\\Softuni\\Softuni\\Java advanced\\Streams, Files And Directories - Exercises\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputLineNumbers.txt";

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
            PrintWriter printWriter=new PrintWriter("LineNumbers.txt");

            String line=bufferedReader.readLine();
            int currentLine=1;

            while(line !=null){
                printWriter.println(currentLine+". "+line);
                currentLine++;
                line=bufferedReader.readLine();
            }
            bufferedReader.close();
            printWriter.close();
        } catch (FileNotFoundException e) {
            System.out.println("File doesn't exist");
        } catch (IOException e) {
            System.out.println("File is empty");
        }
    }
}
