import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] numbers= Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer :: parseInt).toArray();

        int equalElements=0;
        int maxEquals=0;
        int specialNumber=0;
        for (int i = 1; i < numbers.length; i++) {
            if(numbers[i]==numbers[i-1]){
                equalElements++;
            }else{
                equalElements=0;
            }
            if(equalElements>maxEquals){
                maxEquals=equalElements;
                specialNumber=numbers[i];
            }
        }
        for (int i = 0; i < maxEquals+1; i++) {
            System.out.print(specialNumber+" ");
        }
    }
}
