import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CountUppercaseWords {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String[] words=scanner.nextLine().split(" ");

        Predicate<String> isUpperCased= x -> x.charAt(0)>=65 && x.charAt(0)<=90;

        List<String> upperCased=new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            if(isUpperCased.test(words[i])){
                upperCased.add(words[i]);
            }
        }

        System.out.println(upperCased.size());
        upperCased.stream().forEach(x -> System.out.println(x));
    }
}
