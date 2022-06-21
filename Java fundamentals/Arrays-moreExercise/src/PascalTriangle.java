
import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = Integer.parseInt(scanner.nextLine());
        if (rows >= 1 && rows <= 60) {
            int currentRow = 1;
            long[] lastArray = new long[rows];
            lastArray[0] = 1;
            lastArray[currentRow] = 1;
            while (rows >= currentRow) {
                if (currentRow == 1) {
                    System.out.println(1);
                } else if (currentRow == 2) {
                    System.out.print("1" + " " + "1");

                } else {
                    System.out.println();
                    long[] middleArray = new long[currentRow - 2];
                    for (int i = 0; i < middleArray.length; i++) {
                        middleArray[i] = lastArray[i + 1] + lastArray[i];
                    }
                    for (int i = 1; i < lastArray.length; i++) {
                        if (i <= middleArray.length) {
                            lastArray[i] = middleArray[i - 1];
                        } else {
                            lastArray[i] = 1;
                            break;
                        }
                    }
                    for (long number : lastArray) {
                        if (number != 0) {
                            System.out.print(number + " ");
                        }
                    }
                }
                currentRow++;
            }
        }
    }
}