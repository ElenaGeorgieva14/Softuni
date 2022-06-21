import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class StarEnigma {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int lines=Integer.parseInt(scanner.nextLine());
        Pattern pattern=Pattern.compile("[STARstar]");
        List<String> attacked=new ArrayList<>();
        int attackedCount=0;
        List<String> destroyed=new ArrayList<>();
        int destroyedCount=0;

        for (int i = 0; i < lines; i++) {
            StringBuilder encrypted=new StringBuilder(scanner.nextLine());
            int count=findMatches(pattern,encrypted);
            for (int j = 0; j < encrypted.length(); j++) {
                int newChar=encrypted.charAt(j)-count;
                encrypted.insert(j,(char)newChar);
                encrypted.deleteCharAt(j+1);
            }

            Pattern decrypted=Pattern.compile("@(?<name>[A-Z][a-z]+)[^@\\-!:>]*:(?<population>\\d+)[^@\\-!:>]*!(?<attack>[AD])![^@\\-!:>]*->(?<soldiers>\\d+)");
            Matcher decryptedMatcher=decrypted.matcher(encrypted);
            if(decryptedMatcher.find()){
                String attackType=decryptedMatcher.group("attack");
                if(attackType.equals("A")){
                    attacked.add(decryptedMatcher.group("name"));
                    attackedCount++;
                }else {
                    destroyed.add(decryptedMatcher.group("name"));
                    destroyedCount++;
                }
            }
        }

        System.out.printf("Attacked planets: %d%n",attackedCount);
        List<String>sortedAttacked=attacked.stream().sorted().collect(Collectors.toList());
        sortedAttacked.forEach(s-> System.out.printf("-> %s%n",s));

        System.out.printf("Destroyed planets: %d%n",destroyedCount);
        List<String> sortedDestroyed=destroyed.stream().sorted().collect(Collectors.toList());
        sortedDestroyed.forEach(s-> System.out.printf("-> %s%n",s));
    }

    private static int findMatches(Pattern pattern,StringBuilder encrypted){
        int count=0;
        Matcher matcher=pattern.matcher(encrypted);
        for (int j = 0; j < encrypted.length(); j++) {
            if(matcher.find()){
                count++;
            }
        }
        return count;
    }
}
