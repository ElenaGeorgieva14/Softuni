import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ReverseAndExclude {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        List<Integer> numbers= Arrays.stream(scanner.nextLine().split(" ")).map(Integer :: parseInt).collect(Collectors.toList());
        int divisible=Integer.parseInt(scanner.nextLine());

        Predicate<Integer> isNotDivisible= x -> x % divisible ==0;
        numbers.removeIf(isNotDivisible);

        Collections.reverse(numbers);


        numbers.stream().forEach(x -> System.out.print(x + " "));
    }
}
