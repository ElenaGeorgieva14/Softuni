import java.io.*;

public class CopyBytes {
    public static void main(String[] args) {

        String path = "C:\\Users\\Lenovo\\OneDrive\\Documents\\Softuni\\Softuni\\Java advanced\\Streams, Files And Directories - Lab\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        try {

            FileInputStream fileInputStream = new FileInputStream(path);
            FileOutputStream fileOutputStream = new FileOutputStream("CopyBytes.txt");

            int oneByte = fileInputStream.read();

            while (oneByte >= 0) {
                String input = String.valueOf(oneByte);

                if (input.equals("32")) {
                    fileOutputStream.write(' ');
                } else if (input.equals("10")) {
                    fileOutputStream.write(Integer.parseInt(input));
                } else {
                    for (int i = 0; i < input.length(); i++) {
                        fileOutputStream.write(input.charAt(i));
                    }
                }

                oneByte = fileInputStream.read();
            }

            fileInputStream.close();
            fileOutputStream.close();

        } catch (FileNotFoundException e) {
            System.out.println("File doesn't exist");
        } catch (IOException e) {
            System.out.println("File is empty");
        }
    }
}
