import java.util.Scanner;

public class GamingStore {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double balance=Double.parseDouble(scanner.nextLine());
        String input =scanner.nextLine();

        double startingMoney=balance;
        while(!input.equals("Game Time")){
            double price=0.0;

            if(input.equals("OutFall 4")){
                price=39.99;
            }else if(input.equals("CS: OG")){
                price=15.99;
            }else if(input.equals("Zplinter Zell")){
                price=19.99;
            }else if(input.equals("Honored 2")){
                price=59.99;
            }else if(input.equals("RoverWatch")){
                price=29.99;
            }else if(input.equals("RoverWatch Origins Edition")){
                price=39.99;
            }else{
                System.out.println("Not Found");
                input=scanner.nextLine();
                continue;
            }
            if(price<=balance){
                System.out.println("Bought "+input);
                balance-=price;
            }else{
                System.out.println("Too Expensive");
                input= scanner.nextLine();
                continue;
            }
            if(balance<=0){
                System.out.println("Out of money!");
                break;
            }
            input= scanner.nextLine();
        }
        if(balance>0) {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", startingMoney - balance, balance);
        }
    }
}
