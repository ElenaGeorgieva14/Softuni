import java.util.Scanner;

public class AddAndSubtract {
    public static int sumNumbers(int num1,int num2){
        return num1+num2;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number1=Integer.parseInt(scanner.nextLine());
        int number2=Integer.parseInt(scanner.nextLine());
        int number3=Integer.parseInt(scanner.nextLine());

        int total=sumNumbers(number1,number2) - number3;

        System.out.println(total);
    }
}
