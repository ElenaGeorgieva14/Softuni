import java.util.Scanner;
import java.util.function.IntBinaryOperator;

public class EncryptSortAndPrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        String[] names = new String[length];
        int[] sums = new int[length];

        //fill array sum
        for (int i = 0; i < names.length; i++) {
            names[i] = scanner.nextLine();
            int sum = 0;
            for (int j = 0; j < names[i].length(); j++) {
                char letter = names[i].split("")[j].charAt(0);
                if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u'
                        || letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U') {
                    sum += (int) letter * names[i].length();
                } else {
                    sum += (int) letter / names[i].length();
                }
            }
            sums[i] = sum;
        }
        //sort array
        for (int i = 0; i < sums.length; i++) {
            for (int j = i; j < sums.length; j++) {
                if (sums[i] > sums[j]) {
                    int temp = sums[i];
                    sums[i] = sums[j];
                    sums[j] = temp;
                }
            }
        }
        //print array
        for(int sum : sums){
            System.out.println(sum);
        }
    }
}
