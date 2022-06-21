import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DestinationMapper {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        Pattern pattern=Pattern.compile("([=/])(?<destination>[A-Z][A-Za-z]{2,})\\1");
        Matcher matcher=pattern.matcher(input);
        List<String> destinations=new ArrayList<>();
        int travelPoints=0;
        while(matcher.find()){
            destinations.add(matcher.group("destination"));
            travelPoints+=matcher.group("destination").length();
        }
        System.out.printf("Destinations: %s%n",String.join(", ",destinations));
        System.out.printf("Travel Points: %d",travelPoints);
    }
}
