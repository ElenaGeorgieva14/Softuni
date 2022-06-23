import java.util.Arrays;
import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int rows=Integer.parseInt(scanner.nextLine());

        int [][] matrix=new int[rows][rows];


        for (int row = 0; row < rows; row++) {
            int[] array= Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            matrix[row]=array;
        }

        int firstDiagonal=findFirstDiagonal(matrix,rows);
        int secondDiagonal=findSecondDiagonal(matrix,rows);
        System.out.println(Math.abs(firstDiagonal-secondDiagonal));
    }

    private static int findSecondDiagonal(int[][] matrix, int rows) {
        int diagonal=0;
        for (int row = 0; row < rows; row++) {
            diagonal+=matrix[row][rows-1-row];
        }

        return diagonal;
    }

    private static int findFirstDiagonal(int[][] matrix, int rows) {
        int diagonal=0;
        for (int row = 0; row < rows; row++) {
            diagonal+=matrix[row][row];
        }

        return diagonal;
    }
}
