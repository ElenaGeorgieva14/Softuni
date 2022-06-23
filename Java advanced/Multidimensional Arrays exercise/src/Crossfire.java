import java.util.Arrays;
import java.util.Scanner;

public class Crossfire {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int [] dimensions= Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer :: parseInt).toArray();
        int rows=dimensions[0];
        int cols=dimensions[1];

        String[][] matrix=new String[rows][cols];
        int start=1;

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                matrix[row][col]=start+"";
                start++;
            }
        }



        String input=scanner.nextLine();
        while(!input.equals("Nuke it from orbit")) {
            int[] commands = Arrays.stream(input.split(" ")).mapToInt(Integer::parseInt).toArray();
            int row = commands[0];
            int col = commands[1];
            int radius = commands[2];


                matrix[row][col] = null;


            for (int i = 1; i <= radius; i++) {
                if (col - i >= 0) {
                    if (matrix[row][col - i] == null && row-1>=0) {
                        matrix[row-1][col-i]=null;
                    }else {
                        matrix[row][col - i] = null;
                    }
                }
                if (col + i < cols) {
                    if(matrix[row][col+i]==null && row+1<rows) {
                        matrix[row+1][col+i]=null;
                    }else {
                        matrix[row][col + i] = null;
                    }
                }

                if (row - i >= 0) {
                    if (matrix[row - i][col] == null && col+1<cols) {
                        matrix[row-i][col+1]=null;
                    } else {
                        matrix[row - i][col] = null;
                    }
                }
                if (row + i < rows) {
                    if(matrix[row+i][col]==null && col-1>=0){
                        matrix[row +i][col-1] = null;
                    }else{
                        matrix[row + i][col] = null;
                    }

                }
            }
            input=scanner.nextLine();
        }

        printMatrix(matrix,rows,cols);

    }

    private static void printMatrix(String[][] matrix, int rows, int cols) {
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if(matrix[row][col]==null){
                    System.out.print("");
                }else{
                    System.out.print(matrix[row][col]+" ");
               }
            }
            System.out.println();
        }
    }
}
