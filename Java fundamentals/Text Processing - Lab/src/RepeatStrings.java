import java.util.Scanner;

public class RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] input=scanner.nextLine().split(" ");

        for (int i = 0; i < input.length; i++) {
            int wordLength=input[i].length();

            for (int j = 0; j < wordLength; j++) {
                System.out.print(input[i]);
            }
        }
    }
}
