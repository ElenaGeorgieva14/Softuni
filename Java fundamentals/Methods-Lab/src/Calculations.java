import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String operation=scanner.nextLine();
        int num1=Integer.parseInt(scanner.nextLine());
        int num2=Integer.parseInt(scanner.nextLine());

        switch (operation){
            case "subtract":
                Subtract(num1,num2);
                break;
            case "add":
                Add(num1,num2);
                break;
            case "multiply":
                Multiply(num1,num2);
                break;
            case "divide":
                Divide(num1,num2);
        }
    }
    public static void Subtract(int a,int b){
        System.out.println(a-b);
    }
    public static void Add(int a, int b){
        System.out.println(a+b);
    }
    public  static void Multiply(int a, int b){
        System.out.println(a*b);
    }
    public static void Divide(int a, int b) {
        if (b != 0) {
            System.out.println(a / b);
        }
    }
}
