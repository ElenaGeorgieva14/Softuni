import java.util.Scanner;

public class PositionsOf {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] rowCol=scanner.nextLine().split(" ");
        int row=Integer.parseInt(rowCol[0]);
        int col=Integer.parseInt(rowCol[1]);

        int [][] matrix=new int[row][col];

        for (int i = 0; i < row; i++) {
            String [] numbers=scanner.nextLine().split(" ");
            for (int j = 0; j < col; j++) {
                matrix[i][j] = Integer.parseInt(numbers[j]);
            }
        }

        int searchingNumber=Integer.parseInt(scanner.nextLine());
        boolean isFound=false;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(matrix[i][j]==searchingNumber){
                    System.out.println(i+" "+j);
                    isFound=true;
                }
            }
        }

        if(!isFound){
            System.out.println("not found");
        }
    }
}
