import java.util.Scanner;

public class ExtractPersonInformation {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int lines=Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < lines; i++) {
            String input=scanner.nextLine();
            String data=input.split("@")[1];
            String name=data.split("\\|")[0];

            String data1=input.split("#")[1];
            String age=data1.split("\\*")[0];
            System.out.printf("%s is %s years old.%n",name,age);
        }

    }
}
