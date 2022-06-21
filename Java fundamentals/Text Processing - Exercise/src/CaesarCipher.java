import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();

        String output="";

        for (int i = 0; i < input.length(); i++) {
            char newChar=(char)(input.charAt(i)+3);
            output+=newChar;
        }

        System.out.println(output);
    }
}
