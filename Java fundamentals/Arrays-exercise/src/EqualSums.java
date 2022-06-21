import java.util.Arrays;
import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] numbers= Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer :: parseInt).toArray();
        boolean isNotEqual=true;
        for (int i = 0; i < numbers.length; i++) {
            int leftSum=0;
            int rightSum=0;
                for (int j = i - 1; j>=0; j--) {
                    leftSum += numbers[j];
            }
            for (int j = i+1; j <numbers.length ; j++) {
                rightSum+=numbers[j];
            }
            if(leftSum==rightSum){
                isNotEqual=false;
                System.out.println(i);
                break;
            }
        }
        if(isNotEqual){
            System.out.println("no");
        }
    }
}
