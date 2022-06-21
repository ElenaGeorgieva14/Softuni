import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        boolean isEven=false;
        while (isEven==false) {
            if (num % 2 == 0) {
                System.out.println("The number is: "+Math.abs(num));
                isEven=true;
            } else {
                System.out.println("Please write an even number.");
                num=Integer.parseInt(scanner.nextLine());
            }

        }
    }
}
