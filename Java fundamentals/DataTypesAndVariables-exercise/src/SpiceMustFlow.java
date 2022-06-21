import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int storiged = Integer.parseInt(scanner.nextLine());

        int totalInStorige = 0;
        int counterDay = 0;

        while (storiged>=100) {
            totalInStorige +=storiged;
            storiged = storiged - 10;

            totalInStorige -=26;
            counterDay ++;
        }

        totalInStorige = totalInStorige - 26;

        if (totalInStorige < 0) {
            totalInStorige = 0;
        }

        System.out.println(counterDay);
        System.out.println(totalInStorige);
    }
}