import java.util.Scanner;

public class SumMatrixElements {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String [] rowCol=scanner.nextLine().split(", ");
        int row=Integer.parseInt(rowCol[0]);
        int col=Integer.parseInt(rowCol[1]);
        int sum=0;

        int [][] matrix=new int[row][col];
        for (int i = 0; i < row; i++) {
            String[] numbers=scanner.nextLine().split(", ");
            for (int j = 0; j < col; j++) {
                matrix[i][j]=Integer.parseInt(numbers[j]);
                sum+=Integer.parseInt(numbers[j]);
            }
        }

        System.out.println(row);
        System.out.println(col);
        System.out.println(sum);
    }
}
