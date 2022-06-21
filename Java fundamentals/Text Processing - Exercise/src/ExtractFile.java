import java.util.Scanner;

public class ExtractFile {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String path=scanner.nextLine();
        String[] data=path.split("\\\\");

        String fileName=data[data.length-1].split("\\.")[0];
        String fileExtension=data[data.length-1].split("\\.")[1];

        System.out.printf("File name: %s%n",fileName);
        System.out.printf("File extension: %s",fileExtension);
    }
}
