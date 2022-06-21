import java.util.Arrays;
import java.util.Scanner;

public class MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String numbers=scanner.nextLine();
        int realNumber=Integer.parseInt(numbers);
        //long numbers=Long.parseLong(numbers);
        int [] number;
        if(!numbers.contains("-")) {
            number= Arrays.stream(numbers.split("")).mapToInt(Integer::parseInt).toArray();
        }
        else{
           int positiveNumber= Math.abs(realNumber);
            String positiveNum=positiveNumber+"";
            number=Arrays.stream(positiveNum.split("")).mapToInt(Integer::parseInt).toArray();
        }
        int evenSum=SumEvenNumbers(number);
        int oddSum=SumOddNumbers(number);
        System.out.println(MultiplyEvenByOdds(evenSum,oddSum));
    }

    public static int SumEvenNumbers(int[] array){
        int sum=0;
        for (int number : array) {
            if (number % 2 == 0) {
                sum += number;
            }
        }
        return sum;
    }

    public static int SumOddNumbers(int [] array){
        int sum=0;
        for (int number:array) {
            if(number%2!=0){
                sum+=number;
            }
        }
        return sum;
    }

    public static  int MultiplyEvenByOdds(int evenSum, int oddSum){
        return evenSum*oddSum;
    }

}
