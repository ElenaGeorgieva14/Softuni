import java.util.Scanner;

public class MaximumSumOf2x2Submatrix {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String [] rowCol=scanner.nextLine().split(", ");
        int row=Integer.parseInt(rowCol[0]);
        int col=Integer.parseInt(rowCol[1]);

        int[][] matrix=new int[row][col];
        int bestSum=Integer.MIN_VALUE;
        int resultRow=0;
        int resultColumn=0;

        for (int i = 0; i < row; i++) {
            String[] numbers=scanner.nextLine().split(", ");
            for (int j = 0; j < col; j++) {
                matrix[i][j]=Integer.parseInt(numbers[j]);
            }
        }

        for (int i = 0; i < matrix.length-1; i++) {
            for (int j = 0; j < matrix[i].length-1; j++) {
                int sum=matrix[i][j]+matrix[i][j+1]
                        +matrix[i+1][j]+matrix[i+1][j+1];

                if(sum>bestSum){
                    bestSum=sum;
                    resultRow=i;
                    resultColumn=j;
                }
            }
        }
        int [][] resultMatrix=new int[2][2];
        resultMatrix[0][0]=matrix[resultRow][resultColumn];
        resultMatrix[0][1]=matrix[resultRow][resultColumn+1];
        resultMatrix[1][0]=matrix[resultRow+1][resultColumn];
        resultMatrix[1][1]=matrix[resultRow+1][resultColumn+1];

        System.out.printf("%d %d%n",resultMatrix[0][0],resultMatrix[0][1]);
        System.out.printf("%d %d%n",resultMatrix[1][0],resultMatrix[1][1]);
        System.out.println(bestSum);
    }
}

