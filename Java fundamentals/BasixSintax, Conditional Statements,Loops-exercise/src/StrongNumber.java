import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String number=scanner.nextLine();
        int num=Integer.parseInt(number);
        int inputNum=Integer.parseInt(number);
        int digit=0;
        int factoriel=0;
        for (int i = number.length()-1; i >=0 ; i--) {
                digit=num%10;
                num/=10;
                int sum=1;
            for (int j = digit; j >=1 ; j--) {
                sum*=j;
            }
            factoriel+=sum;
        }

        if(factoriel==inputNum){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}
