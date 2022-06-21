import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        double sum=0.0;

        while(!input.equals("Start")){
            double coin=Double.parseDouble(input);
            if(coin==0.1 || coin==0.2 || coin==0.5
            || coin==1.0 || coin ==2.0){
                sum+=coin;
            }else{
                System.out.printf("Cannot accept %.2f%n",coin);
            }
            input=scanner.nextLine();
        }
            input=scanner.nextLine();

        while(!input.equals("End")){
            double price=0.0;
            if(input.equals("Nuts")){
                price=2.0;
            }else if(input.equals("Water")){
                price=0.7;
            }else if(input.equals("Crisps")){
                price=1.5;
            }else if(input.equals("Soda")){
                price=0.8;
            }else if(input.equals("Coke")){
                price=1.0;
            }else{
                System.out.println("Invalid product");
                input= scanner.nextLine();
                continue;
            }

            if(price<=sum){
              sum-=price;
                System.out.printf("Purchased %s%n",input);
            }else{
                System.out.println("Sorry, not enough money");
            }
            input=scanner.nextLine();
        }
        System.out.printf("Change: %.2f",sum);
    }
}
