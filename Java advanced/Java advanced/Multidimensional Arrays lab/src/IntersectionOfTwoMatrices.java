import java.util.Scanner;

public class IntersectionOfTwoMatrices {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int row=Integer.parseInt(scanner.nextLine());
        int col=Integer.parseInt(scanner.nextLine());

        char [][] firstMatrix=new char[row][col];
        char [][] secondMatrix=new char[row][col];

        //fill first matrix
        for (int i = 0; i < row; i++) {
            String[] data=scanner.nextLine().split(" ");
            for (int j = 0; j < col; j++) {
                firstMatrix[i][j]=data[j].charAt(0);
            }
        }

        //fill second matrix
        for (int i = 0; i < row; i++) {
            String[] data=scanner.nextLine().split(" ");
            for (int j = 0; j < col; j++) {
                secondMatrix[i][j]=data[j].charAt(0);
            }
        }

        char[][] newMatrix= newMatrix(firstMatrix,secondMatrix,row,col);

        printMatrix(newMatrix,row,col);
    }

    private static void printMatrix(char[][] newMatrix,int row,int col) {
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(newMatrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    private static char[][] newMatrix(char[][] firstMatrix, char[][] secondMatrix, int row, int col) {
        char[][] newMatrix=new char[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(firstMatrix[i][j]==secondMatrix[i][j]){
                    newMatrix[i][j]=firstMatrix[i][j];
                }else{
                    newMatrix[i][j]='*';
                }
            }
        }
        return newMatrix;
    }
}
