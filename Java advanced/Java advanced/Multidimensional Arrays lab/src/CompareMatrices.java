import java.util.Arrays;
import java.util.Scanner;

public class CompareMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //firstMatrix
        String[] rowCol = scanner.nextLine().split(" ");
        int row = Integer.parseInt(rowCol[0]);
        int col = Integer.parseInt(rowCol[1]);

        int[][] firstMatrix = new int[row][col];

        for (int i = 0; i < row; i++) {
            String[] numbers = scanner.nextLine().split(" ");
            for (int j = 0; j < col; j++) {
                firstMatrix[i][j] = Integer.parseInt(numbers[j]);
            }
        }


        //Second Matrix
        String[] rowCol1 = scanner.nextLine().split(" ");
        int row1 = Integer.parseInt(rowCol1[0]);
        int col1 = Integer.parseInt(rowCol1[1]);

        int[][] secondMatrix = new int[row1][col1];

        for (int i = 0; i < row1; i++) {
            String[] numbers = scanner.nextLine().split(" ");
            for (int j = 0; j < col1; j++) {
                secondMatrix[i][j] = Integer.parseInt(numbers[j]);
            }
        }

        boolean isEqual = Compare(row, col, row1, col1, firstMatrix, secondMatrix);

        if(isEqual){
            System.out.println("equal");
        }else{
            System.out.println("not equal");
        }
    }

    private static boolean Compare(int row, int col, int row1, int col1, int[][] firstMatrix, int[][] secondMatrix) {
        boolean isEqual=true;

        if(row==row1 && col == col1){
            for (int i = 0; i <row ; i++) {
                for (int j = 0; j < col; j++) {
                    if(firstMatrix[i][j]!=secondMatrix[i][j]){
                        isEqual=false;
                        break;
                    }
                }
            }
        }else{
            isEqual=false;
        }

        return isEqual;

    }
}
