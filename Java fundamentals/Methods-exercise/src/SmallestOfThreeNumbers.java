
import java.util.Scanner;

public class SmallestOfThreeNumbers {
    public static void PrintMinNumber(int num1, int num2,int num3){
        int minNumber=Integer.MAX_VALUE;
        if(num1<minNumber){
            minNumber=num1;
        }
        if(num2<minNumber){
            minNumber=num2;
        }
        if(num3<minNumber){
            minNumber=num3;
        }
        System.out.println(minNumber);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number1=Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        int number3=Integer.parseInt(scanner.nextLine());

        PrintMinNumber(number1,number2,number3);

    }
}
