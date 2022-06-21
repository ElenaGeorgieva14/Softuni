import java.util.Scanner;

public class Messages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        System.out.println();
        while(input!=0) {
            input=scanner.nextInt();
            int digitNumber = String.valueOf(input).length();
            int mainDigit = input % 10;
            int offset = (mainDigit - 2) * 3;
            if (mainDigit == 8 || mainDigit == 9) {
                offset += 1;
            }
            int letterIndex = offset + digitNumber - 1;
            int asciiIndex = 97 + letterIndex;
            if (input == 0) {
                asciiIndex = 32;
            }
            char letter = (char) asciiIndex;
            System.out.print(letter);
        }
    }
}
