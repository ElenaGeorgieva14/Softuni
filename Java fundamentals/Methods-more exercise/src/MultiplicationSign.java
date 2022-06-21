import java.util.Scanner;

public class MultiplicationSign {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num1=Integer.parseInt(scanner.nextLine());
        int num2=Integer.parseInt(scanner.nextLine());
        int num3=Integer.parseInt(scanner.nextLine());

        System.out.println(findSign(num1,num2,num3));
    }

    public static String findSign(int number1, int number2,int number3){
        String sign="";
        if(number1>0 && number2>0 && number3>0){
            sign="positive";
        }else if(number1==0 || number2==0 || number3== 0){
            sign="zero";
        } else if(number1<0 && number2>0 && number3>0){
            sign="negative";
        }else if(number1>0 && number2<0 && number3>0){
            sign="negative";
        }else if(number1 > 0 && number2 > 0 ){
            sign="negative";
        }else{
            sign="positive";
        }
        return sign;
    }
}
