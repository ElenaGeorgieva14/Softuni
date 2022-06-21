import java.util.Scanner;

public class BurgerBus {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int cities=Integer.parseInt(scanner.nextLine());
        double totalProfit=0.0;
        for (int i = 1; i <= cities; i++) {
            String name=scanner.nextLine();
            double earnedMoney=Double.parseDouble(scanner.nextLine());
            double expenses=Double.parseDouble(scanner.nextLine());

            if(i%3==0 && i%5!=0){
                expenses*=1.5;
            }
            if(i%5==0){
                earnedMoney*=0.9;
            }
            double profit=earnedMoney-expenses;
            totalProfit+=profit;
            System.out.printf(	"In %s Burger Bus earned %.2f leva.%n",name,profit);
        }
        System.out.printf(	"Burger Bus total profit: %.2f leva.",totalProfit);
    }
}
