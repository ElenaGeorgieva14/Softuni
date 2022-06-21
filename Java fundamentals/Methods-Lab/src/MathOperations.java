import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int firstNum=Integer.parseInt(scanner.nextLine());
        char operation=scanner.nextLine().charAt(0);
        int secondNum=Integer.parseInt(scanner.nextLine());

        System.out.printf("%.0f",CalculateNumbers(firstNum,operation,secondNum));
    }
    public static double CalculateNumbers(int num1, char operator,int num2){
        double sum=0;

        switch (operator){
            case'/':
                if(num2!=0) {
                    sum = num1*1.0 / num2;
                }
                break;
            case '*':
                sum=num1*num2;
                break;
            case '+':
                sum =num1+num2;
                break;
            case '-':
                sum=num1-num2;
                break;
        }
        return sum;
    }
}
