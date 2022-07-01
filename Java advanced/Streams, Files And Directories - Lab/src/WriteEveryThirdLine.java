import java.io.*;

public class WriteEveryThirdLine {
    public static void main(String[] args) {

        String path="C:\\Users\\Lenovo\\OneDrive\\Documents\\Softuni\\Softuni\\Java advanced\\Streams, Files And Directories - Lab\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        try {
            BufferedReader input = new BufferedReader(new FileReader(path));
            PrintWriter  out=new PrintWriter(new FileWriter("EveryThirdLine.txt"));

            int counter=1;
            String line=input.readLine();

            while(line!=null){
                if(counter%3==0){
                    out.println(line);
                }
                counter++;
                line=input.readLine();
            }
            input.close();
            out.close();

        }catch(FileNotFoundException e){
            System.out.println("File doesn't exist");
        } catch (IOException e) {
            System.out.println("File is empty");
        }
    }
}
