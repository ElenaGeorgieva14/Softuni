import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class WriteToFile {
    public static void main(String[] args) {

        String path="C:\\Users\\Lenovo\\OneDrive\\Documents\\Softuni\\Softuni\\Java advanced\\Streams, Files And Directories - Lab\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";

        Set<Character> forbiddenCharacters=new HashSet<>();
        forbiddenCharacters.add('.');
        forbiddenCharacters.add(',');
        forbiddenCharacters.add('!');
        forbiddenCharacters.add('?');
        try{
            FileInputStream fileInputStream=new FileInputStream(path);
            FileOutputStream fileOutputStream=new FileOutputStream("newInput.txt");

            int oneByte=fileInputStream.read();
            while(oneByte>=0) {
                if (!forbiddenCharacters.contains((char) oneByte)) {
                    fileOutputStream.write(oneByte);
                }
                oneByte= fileInputStream.read();
            }

            fileInputStream.close();
            fileOutputStream.close();

        }catch (FileNotFoundException e){
            System.out.println("File doesn't exist");
        } catch (IOException e) {
            System.out.println("File is empty");
        }

    }
}
