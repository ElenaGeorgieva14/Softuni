import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number=Integer.parseInt(scanner.nextLine());
        double totalPrice=0;
        for (int i = 0; i < number; i++) {
            double pricePerCapsule=Double.parseDouble(scanner.nextLine());
            int days=Integer.parseInt(scanner.nextLine());
            int capsules=Integer.parseInt(scanner.nextLine());
            double pricePerOrder=days*capsules*pricePerCapsule;
            totalPrice+=pricePerOrder;
            System.out.printf(	"The price for the coffee is: $%.2f%n",pricePerOrder);
        }
        System.out.printf("Total: $%.2f",totalPrice);
    }
}
