import java.math.BigInteger;
import java.util.Scanner;

public class BigFactorial {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        BigInteger number= new BigInteger(scanner.nextLine());
        BigInteger factorial = new BigInteger("1");
        for (int i = 1; i <=number.intValueExact() ; i++) {
           factorial=factorial.multiply(BigInteger.valueOf(Integer.parseInt(String.valueOf(i))));
        }
        System.out.println(factorial);
    }
}
