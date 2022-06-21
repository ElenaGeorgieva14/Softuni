import java.util.Arrays;
import java.util.Scanner;

public class WrongMeasurements {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int rows=Integer.parseInt(scanner.nextLine());

        int[][] matrix=new int[rows][];

        for (int i = 0; i < rows; i++) {
            int[] row= Arrays.stream(scanner.nextLine().split(" ")).mapToInt(num->Integer.parseInt(num)).toArray();
            matrix[i]=row;
        }

        int [] wrongValuePlace=Arrays.stream(scanner.nextLine().split(" ")).mapToInt(num->Integer.parseInt(num)).toArray();

        int wrongValue=matrix[wrongValuePlace[0]][wrongValuePlace[1]];

        //find wrongValues
        int[][] resultMatrix=new int[rows][];
        for (int i = 0; i < rows; i++) {
            int[] resultArray=new int[matrix[i].length];
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j]==wrongValue){

                    int sum=0;
                    //up
                    if(i>0){
                        if(matrix[i-1][j]!=wrongValue)
                            sum+=matrix[i-1][j];
                    }

                    //down
                    if(i!=rows-1){
                        if(matrix[i+1][j]!=wrongValue)
                            sum+=matrix[i+1][j];
                    }

                    //left
                    if(j>0){
                        if(matrix[i][j-1]!=wrongValue)
                            sum+=matrix[i][j-1];
                    }

                    //right
                    if(j!=matrix[i].length-1){
                        if(matrix[i][j+1]!=wrongValue)
                            sum+=matrix[i][j+1];
                    }
                    resultArray[j]=sum;

                }else{
                    resultArray[j]=matrix[i][j];
                }
            }
            resultMatrix[i]=resultArray;
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < resultMatrix[i].length; j++) {
                System.out.print(resultMatrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
