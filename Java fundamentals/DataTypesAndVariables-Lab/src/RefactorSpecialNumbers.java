import java.util.Scanner;

public class RefactorSpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= input; i++) {
            int sum = 0;
            int digit = i;
            while (digit > 0) {
                sum += digit % 10;
                digit /= 10;
            }


            if((sum == 5) || (sum == 7) || (sum == 11)){
                System.out.printf("%d -> True%n",i);
            }else{
                System.out.printf("%d -> False%n",i);
            }

        }
    }
}
