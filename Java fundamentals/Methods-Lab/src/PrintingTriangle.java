import java.util.Scanner;

public class PrintingTriangle {
    public static void CreateTriangle(int number) {
        for (int i = 0; i < number ; i++) {
            for (int j = 1; j <= i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        for (int i = number-1; i > 0; i--) {
            for (int j =1 ; j <=i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        CreateTriangle(number);
    }
}
