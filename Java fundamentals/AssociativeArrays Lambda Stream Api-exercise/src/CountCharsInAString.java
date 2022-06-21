import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String[] words=scanner.nextLine().split(" ");
        Map<Character,Integer>letterNumber=new LinkedHashMap<>();
        for (int i = 0; i < words.length; i++) {
            String currentWord=words[i];

            for (int j = 0; j < currentWord.length(); j++) {
                char letter=currentWord.charAt(j);
                if(!letterNumber.containsKey(letter)){
                    letterNumber.put(letter,0);
                }
                letterNumber.put(letter,letterNumber.get(letter)+1);
            }
        }
        letterNumber.forEach((key,value) -> System.out.printf("%c -> %d%n",key,value) );
    }
}
