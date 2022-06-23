import java.util.Scanner;

public class MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] input=scanner.nextLine().split(" ");
        int rows=Integer.parseInt(input[0]);
        int cols=Integer.parseInt(input[1]);

        String [][] matrix=new String[rows][cols];
        char firstSymbol=97;

        for (int row = 0; row < rows; row++) {
            char middleSymbol=firstSymbol;
            for (int col = 0; col < cols; col++) {
                matrix[row][col]=""+firstSymbol+middleSymbol+firstSymbol;
                middleSymbol++;
            }
            firstSymbol++;
        }


        printMatrix(matrix,cols,rows);
    }

    private static void printMatrix(String[][] matrix, int cols, int rows) {
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.print(matrix[row][col]+" ");
            }
            System.out.println();
        }
    }
}
