import java.util.Scanner;
public class PthBit {
        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            int number=Integer.parseInt(scanner.nextLine());
            int position=Integer.parseInt(scanner.nextLine());
            int[] numberBinary=new int[16];

            for (int i = 15; i >=0 ; i--) {
                numberBinary[i]=number%2;
                number/=2;
            }

            System.out.println(numberBinary[15-position]);
        }
    }

