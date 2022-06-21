import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MessageDecrypter {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int lines=Integer.parseInt(scanner.nextLine());
        Pattern pattern=Pattern.compile("^([$%])(?<tag>[A-Z][a-z]{2,})\\1: \\[(?<char1>\\d+)\\]\\|\\[(?<char2>\\d+)\\]\\|\\[(?<char3>\\d+)\\]\\|$");
        for (int i = 0; i < lines; i++) {
            String message=scanner.nextLine();
            Matcher matcher=pattern.matcher(message);
            if(matcher.find()){
                StringBuilder descriptedMsg=new StringBuilder();

                descriptedMsg.append((char)Integer.parseInt(matcher.group("char1")));
                descriptedMsg.append((char)Integer.parseInt(matcher.group("char2")));
                descriptedMsg.append((char)Integer.parseInt(matcher.group("char3")));
                System.out.printf("%s: %s%n",matcher.group("tag"),descriptedMsg);
            }else{
                System.out.println("Valid message not found!");
            }
        }
    }
}
