import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortLines {
    public static void main(String[] args) {
        Path path= Paths.get("C:\\Users\\Lenovo\\OneDrive\\Documents\\Softuni\\Softuni\\Java advanced\\Streams, Files And Directories - Lab\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt");
        Path output=Paths.get("C:\\Users\\Lenovo\\OneDrive\\Documents\\Softuni\\Softuni\\Java advanced\\Sort.txt");
        try {
            List<String> lines =Files.readAllLines(path);
            lines=lines.stream().filter(l -> !l.isBlank()).collect(Collectors.toList());
            Collections.sort(lines);

            Files.write(output,lines);
        } catch (IOException e) {
            System.out.println("File is empty");
        }
    }
}
