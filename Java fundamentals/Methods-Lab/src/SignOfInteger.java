import java.util.Scanner;

public class SignOfInteger {
    public static String PrintSign(int number){
        if(number>0){
            return "positive";
        }else if(number==0){
            return "zero";
        }else{
            return "negative";
        }

    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number=Integer.parseInt(scanner.nextLine());
        String sign=PrintSign(number);
        System.out.printf("The number %d is %s.",number,sign);
    }
}
