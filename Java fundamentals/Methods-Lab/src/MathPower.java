import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower {
    public static double RaisingNumber(double number,int rate){
       return Math.pow(number,rate);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double number=Double.parseDouble(scanner.nextLine());
        int rate=Integer.parseInt(scanner.nextLine());

        System.out.println(new DecimalFormat("0.####").format(RaisingNumber(number,rate)));
    }
}
