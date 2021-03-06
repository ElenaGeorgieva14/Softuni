import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchPhoneNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String numbers=scanner.nextLine();
        Pattern pattern= Pattern.compile("\\+359([\\s-])2\\1\\d{3}\\1\\d{4}\\b");
        Matcher matcher=pattern.matcher(numbers);
        List<String> correctNums=new ArrayList<>();
        while(matcher.find()){
            correctNums.add(matcher.group());
        }
        System.out.println(String.join(", ",correctNums));
    }
}
