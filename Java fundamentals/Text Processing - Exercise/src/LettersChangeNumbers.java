import java.util.Scanner;

public class LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] text = scanner.nextLine().split(" ");
        double sum=0.0;
        for (int i = 0; i < text.length; i++) {
            String combination=text[i];
            if (combination.charAt(0) >= 65 && combination.charAt(0) <= 90) {
                String num = combination.charAt(1) + "" + combination.charAt(2) + "";
                int number = Integer.parseInt(String.valueOf(num));

                number=number/combination.charAt(0);
                sum+=number;
            } else {

            }
        }
    }
}
