import java.util.Scanner;

public class PrintDiagonalsOfSquareMatrix {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int row=Integer.parseInt(scanner.nextLine());

        int[][] matrix=new int[row][row];

        for (int i = 0; i < row; i++) {
            String[] numbers=scanner.nextLine().split(" ");
            for (int j = 0; j < row; j++) {
                matrix[i][j]=Integer.parseInt(numbers[j]);
            }
        }

        String diagonal="";
        for (int i = 0; i < row; i++) {
            diagonal+=matrix[i][i]+" ";
        }

        String diagonal1="";
        int col=0;
        for (int i = row-1; i >=0; i--) {
            diagonal1+=matrix[i][col]+" ";
            col++;
        }

        System.out.println(diagonal);
        System.out.println(diagonal1);
    }
}
