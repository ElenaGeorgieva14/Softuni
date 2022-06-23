import java.util.Arrays;
import java.util.Scanner;

public class MaximalSum {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] matrixData= Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer :: parseInt).toArray();

        int rows=matrixData[0];
        int cols=matrixData[1];

        int[][] matrix=new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            int [] currentArray= Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer :: parseInt).toArray();
            matrix[row]=currentArray;

        }

        int maxSum=Integer.MIN_VALUE;
        int bestStartingRow=-1;
        int bestStartingCol=-1;

        for (int row = 0; row <rows-2 ; row++) {
            for (int col = 0; col < cols-2; col++) {
                int sumMatrix=matrix[row][col]+matrix[row][col+1]+matrix[row][col+2]+
                              matrix[row+1][col]+matrix[row+1][col+1]+matrix[row+1][col+2]+
                              matrix[row+2][col]+matrix[row+2][col+1]+matrix[row+2][col+2];

                if(sumMatrix>maxSum){
                    maxSum=sumMatrix;
                    bestStartingRow=row;
                    bestStartingCol=col;
                }
            }
        }

        System.out.printf("Sum = %d%n",maxSum);

        for (int row = bestStartingRow; row < bestStartingRow+3; row++) {
            for (int col = bestStartingCol; col <bestStartingCol+3 ; col++) {
                System.out.print(matrix[row][col]+" ");
            }
            System.out.println();
        }
    }
}
