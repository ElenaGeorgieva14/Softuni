import java.util.Scanner;

public class Divison {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=Integer.parseInt(scanner.nextLine());
        int division=0;
        boolean isDivisible=true;
        if(num%10==0){
            division=10;
        }else if(num%7==0){
            division=7;
        }else if(num%6==0){
            division=6;
        }else if(num%3==0){
            division=3;
        }else if(num%2==0){
            division=2;
        }else{
            isDivisible=false;
        }
        if(isDivisible==true) {
            System.out.printf("The number is divisible by %d", division);
        }else{
            System.out.println("Not divisible");
        }
    }
}
