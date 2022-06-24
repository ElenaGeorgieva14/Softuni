import java.util.Arrays;
import java.util.Scanner;

public class ReverseMatrixDiagonals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] data = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int rows = data[0];
        int cols = data[1];

        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            int[] currentRow = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            matrix[row] = currentRow;
        }

        for (int col = cols - 1; col >= 0; col--) {

            for (int row = rows - 1, currentCol = col; row >= 0 && currentCol < cols; row--, currentCol++) {
                System.out.print(matrix[row][currentCol] + " ");
            }
            System.out.println();
            if (col == 0) {
                for (int row = rows - 2; row >= 0; row--) {
                    for (int currentRow = row, currentCol = 0; currentRow >= 0 && currentCol < cols; currentRow--, currentCol++) {
                        System.out.print(matrix[currentRow][currentCol] + " ");
                    }
                    System.out.println();
                }
            }

        }

    }
}

