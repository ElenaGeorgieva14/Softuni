import java.util.Scanner;


public class RecursiveFibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int wantedNum = Integer.parseInt(scanner.nextLine());
        if (wantedNum >= 1 && wantedNum <= 50) {
            long[] fibonacci = new long[wantedNum];
            fibonacci[0] = 1;

            if (wantedNum > 1) {
                fibonacci[1] = 1;
            }
            if (wantedNum > 2) {

                for (int i = 2; i < fibonacci.length; i++) {
                    fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
                }
            }
            System.out.println(fibonacci[wantedNum - 1]);
        }
    }
}
