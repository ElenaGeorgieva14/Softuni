import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] input=scanner.nextLine().split(", ");

        Function<String ,Integer> function= x-> Integer.parseInt(x);

        int sum=0;

        for(String number: input){
            sum+= function.apply(number);
        }

        System.out.printf("Count = %d%n",input.length);
        System.out.printf("Sum = %d%n",sum);
    }
}
