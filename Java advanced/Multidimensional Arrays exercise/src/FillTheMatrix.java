import java.util.Scanner;

public class FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");
        int rows = Integer.parseInt(input[0]);
        String type = input[1];

        int[][] matrix = new int[rows][rows];

        switch (type) {
            case "A":
                fillMatrixA(matrix, rows);
                break;
            case "B":
                fillMatrixB(matrix, rows);
                break;
        }

        printMatrix(matrix,rows);
    }

    private static void printMatrix(int[][] matrix,int rows) {
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < rows; col++) {
                System.out.print(matrix[row][col]+" ");
            }
            System.out.println();
        }
    }

    private static void fillMatrixB(int[][] matrix, int rows) {
        int start = 0;
        for (int col = 0; col < rows; col++) {
            if (col % 2 == 0) {

                for (int row = 0; row < rows; row++) {
                    start++;
                    matrix[row][col]=start;
                }

            } else {
                for (int row = rows-1; row >=0 ; row--) {
                    start++;
                    matrix[row][col]=start;
                }
            }
        }
    }

    private static void fillMatrixA(int[][] matrix, int rows) {
        int start = 0;
        for (int col = 0; col < rows; col++) {
            for (int row = 0; row < rows; row++) {
                start++;
                matrix[row][col] = start;
            }
        }
    }
}
