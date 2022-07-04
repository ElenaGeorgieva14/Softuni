import java.util.Arrays;
import java.util.Scanner;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class AddVAT {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        double[] prices= Arrays.stream(scanner.nextLine().split(", ")).mapToDouble(Double :: parseDouble).toArray();

        UnaryOperator<Double> addVat=value -> value*1.2;

        for (int i = 0; i < prices.length; i++) {
            prices[i] =addVat.apply(prices[i]);
        }



        System.out.println("Prices with VAT:");
        Arrays.stream(prices).forEach(x -> System.out.printf("%.2f%n",x));
    }
}
