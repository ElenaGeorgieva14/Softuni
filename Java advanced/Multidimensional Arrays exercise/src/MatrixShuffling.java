import java.util.Arrays;
import java.util.Scanner;

public class MatrixShuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] matrixDimension = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String[][] matrix = new String[matrixDimension[0]][matrixDimension[1]];

        for (int row = 0; row < matrixDimension[0]; row++) {
            String[] array = scanner.nextLine().split(" ");
            matrix[row] = array;
        }

        String input = scanner.nextLine();

        while (!input.equals("END")) {


            String[] data = input.split(" ");
            String command = data[0];
            if (command.equals("swap") && data.length == 5) {
                int row1 = Integer.parseInt(data[1]);
                int col1 = Integer.parseInt(data[2]);
                int row2 = Integer.parseInt(data[3]);
                int col2 = Integer.parseInt(data[4]);
                if (row1 <= matrixDimension[0] - 1 && row2 <= matrixDimension[0] - 1 &&
                        col1 <= matrixDimension[1] - 1 && col2 <= matrixDimension[1] - 1) {
                    swap(matrix, row1, col1, row2, col2);
                    printMatrix(matrix, matrixDimension[0], matrixDimension[1]);
                } else {
                    System.out.println("Invalid input!");
                }
            } else {
                System.out.println("Invalid input!");
            }

            input = scanner.nextLine();
        }
    }

    private static void printMatrix(String[][] matrix, int rows, int cols) {
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static void swap(String[][] matrix, int row1, int col1, int row2, int col2) {
        String temp = matrix[row1][col1];
        matrix[row1][col1] = matrix[row2][col2];
        matrix[row2][col2] = temp;
    }
}
