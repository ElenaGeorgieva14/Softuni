import java.util.Scanner;

public class FactorialDivision {
    public static long Factorial (int number){
        long factorial=1;

        for (int i =1; i <=number ; i++) {
            factorial *=i;
        }
        return factorial;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num1=Integer.parseInt(scanner.nextLine());
        int num2=Integer.parseInt(scanner.nextLine());

        long firstFactorial=Factorial(num1);
        long secondFactorial=Factorial(num2);

        System.out.printf("%.2f",firstFactorial*1.0/secondFactorial);
    }
}
