import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SortEvenNumbers {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String[] data=scanner.nextLine().split(", ");
        List<Integer> numbers=new ArrayList<>();

        for (int i = 0; i < data.length; i++) {
            numbers.add(Integer.parseInt(data[i]));
        }

        numbers.removeIf(n-> n%2 !=0);
        String output=numbers.stream()
                .map(n -> n+"")
                .collect(Collectors.joining(", "));
        System.out.println(output);

        numbers.sort((n1,n2) -> n1.compareTo(n2));
        output=numbers.stream()
                .map(n -> n+"")
                .collect(Collectors.joining(", "));
        System.out.println(output);
    }
}
