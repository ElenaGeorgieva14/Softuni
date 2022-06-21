import java.math.BigDecimal;
import java.util.Scanner;

public class FloatingEquality {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double number1=Double.parseDouble(scanner.nextLine());
        double number2=Double.parseDouble(scanner.nextLine());
        double eps=0.000001;
        boolean isEqual=false;
        double error=0.0;
        if(number2>number1){
            error=number2-number1;
        }else if(number1>number2){
            error=number1-number2;
        }

        if(error<eps){
            isEqual=true;
        }

        if(isEqual){
            System.out.println("True");
        }else{
            System.out.println("False");
        }

    }
}
