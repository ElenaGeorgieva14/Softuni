import java.util.Arrays;
import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        String[] input = new String[length];
        String[] firstArray = new String[length];
        String[] secondArray = new String[length];
        for (int i = 0; i < length; i++) {

            input[i] = scanner.nextLine();
            if (i % 2 == 0) {
                firstArray[i] = input[i].split(" ")[0];
                secondArray[i] = input[i].split(" ")[1];
            } else {
                firstArray[i] = input[i].split(" ")[1];
                secondArray[i] = input[i].split(" ")[0];
            }
        }

        for(String item: firstArray){
            System.out.print(item+" ");
        }
        System.out.println();
        for(String item:secondArray){
            System.out.print(item+" ");
        }
    }
}

