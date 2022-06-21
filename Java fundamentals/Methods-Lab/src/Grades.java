import java.util.Scanner;

public class Grades {
    public static String GradeToWords(double grade){
        if(grade>=2.0 && grade<=2.99){
            return "Fail";
        }else if(grade>=3.0 && grade<=3.49){
            return "Poor";
        }else if(grade>=3.5 && grade<=4.49){
            return "Good";
        }else if(grade>=4.5 && grade<=5.49){
            return "Very good";
        }else {
            return "Excellent";
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double grade=Double.parseDouble(scanner.nextLine());
        System.out.println(GradeToWords(grade));
    }
}
