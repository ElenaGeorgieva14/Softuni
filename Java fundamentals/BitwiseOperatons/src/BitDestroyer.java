import java.util.Scanner;

public class BitDestroyer {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number=Integer.parseInt(scanner.nextLine());
        int position=Integer.parseInt(scanner.nextLine());
        int[] numberBinary=new int[12];

        for (int i = 11; i >=0 ; i--) {
            numberBinary[i]=number%2;
            number/=2;
        }

        numberBinary[11-position]=0;
        int newNum=0;

        for (int i = 0; i <numberBinary.length ; i++) {
            newNum+=numberBinary[i]*Math.pow(2,11-i);
        }
        System.out.println(newNum);
    }
}
