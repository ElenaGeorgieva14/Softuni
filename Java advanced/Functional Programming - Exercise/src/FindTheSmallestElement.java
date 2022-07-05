import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindTheSmallestElement {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        List<Integer> numbers= Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer :: parseInt).collect(Collectors.toList());

        Function<List<Integer>,Integer> findSmallest= (numbersList) -> {
            int min= Integer.MAX_VALUE;
            int minElementIndex=-1;

            for (int i = 0; i < numbersList.size(); i++) {
                if(numbersList.get(i)<=min){
                    min=numbersList.get(i);
                    minElementIndex=i;
                }
            }
            return minElementIndex;
        };

        int elementIndex=findSmallest.apply(numbers);
        System.out.println(elementIndex);
    }
}
