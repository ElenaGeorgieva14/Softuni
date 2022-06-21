import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdAstra {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String allFood=scanner.nextLine();
        Pattern pattern=Pattern.compile("(?<surronders>[|#])(?<name>[(A-Z) (a-z) ]+)\\1(?<expirationDate>\\d{2}\\/\\d{2}\\/\\d{2})\\1(?<calories>\\d+)\\1");
        Matcher matcher=pattern.matcher(allFood);

        int calories=0;
        while(matcher.find()){
            calories+=Integer.parseInt(matcher.group("calories"));
        }

        System.out.printf("You have food to last you for: %d days!%n",calories/2000);


        Matcher newMatcher=pattern.matcher(allFood);
        while(newMatcher.find()){
            String name=newMatcher.group("name");
            String date=newMatcher.group("expirationDate");
            String nutrition=newMatcher.group("calories");
            System.out.printf("Item: %s, Best before: %s, Nutrition: %s%n",name,date,nutrition);
        }

    }
}
