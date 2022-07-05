import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class CustomMinFunction {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int[] numbers= Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer :: parseInt).toArray();


        Function<int[],Integer> findMin= (int[] arr) ->{
                int min=Integer.MAX_VALUE;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return  min;
        };

        int minElement=findMin.apply(numbers);

        System.out.println(minElement);
    }
}
