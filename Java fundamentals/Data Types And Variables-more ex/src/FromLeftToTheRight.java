import java.util.Scanner;

public class FromLeftToTheRight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lines = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < lines; i++) {
            String input = scanner.nextLine();
            String num1 = "";
            String num2 = "";
            int sumOfDigitsLeft = 0;
            int sumOfDigitsRight = 0;
            for (int j = 0; j < input.length(); j++) {
                if (input.charAt(j) == 32) {
                    for (int k = j + 1; k < input.length(); k++) {
                        num2 += input.charAt(k);
                        if (input.charAt(k) >= 48 && input.charAt(k) <= 57) {
                            sumOfDigitsRight += Integer.parseInt(String.valueOf(input.charAt(k)));
                        }
                    }
                    break;
                } else {
                    num1 += input.charAt(j);
                    if (input.charAt(j) >= 48 && input.charAt(j) <= 57) {
                        sumOfDigitsLeft += Integer.parseInt(String.valueOf(input.charAt(j)));
                    }
                }
            }

            long number1 = Long.parseLong(num1);
            long number2 = Long.parseLong(num2);

            if (number1 > number2) {
                System.out.println(sumOfDigitsLeft);
            } else {
                System.out.println(sumOfDigitsRight);
            }
        }
    }
}
