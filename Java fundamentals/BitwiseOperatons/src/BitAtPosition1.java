import java.util.Scanner;

public class BitAtPosition1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number=Integer.parseInt(scanner.nextLine());
        int[] numberBinary=new int[8];

        for (int i = 7; i >=0 ; i--) {
            numberBinary[i]=number%2;
            number/=2;
        }

        System.out.println(numberBinary[6]);
    }
}
