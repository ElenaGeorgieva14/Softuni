import java.math.BigDecimal;
import java.util.Scanner;

public class PoundsToDollars {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        BigDecimal pounds = new BigDecimal(scanner.nextLine());
        BigDecimal dolar=new BigDecimal(1.36);
        System.out.printf("%.3f",pounds.multiply(dolar));
    }
}
