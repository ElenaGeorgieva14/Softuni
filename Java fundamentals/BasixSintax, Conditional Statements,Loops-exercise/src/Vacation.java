import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number=Integer.parseInt(scanner.nextLine());
        String type=scanner.nextLine();
        String day=scanner.nextLine();

        double pricePerDay=0.0;
        double totalPrice=0.0;
        if(type.equals("Students")){
            if(day.equals("Friday")){
                pricePerDay=8.45;
            }else if(day.equals("Saturday")){
                pricePerDay=9.8;
            }else if(day.equals("Sunday")){
                pricePerDay=10.46;
            }
        }else if(type.equals("Business")){
            if(day.equals("Friday")){
                pricePerDay=10.9;
            }else if(day.equals("Saturday")){
                pricePerDay=15.6;
            }else if(day.equals("Sunday")){
                pricePerDay=16;
            }
        }else if(type.equals("Regular")){
            if(day.equals("Friday")){
                pricePerDay=15;
            }else if(day.equals("Saturday")){
                pricePerDay=20;
            }else if(day.equals("Sunday")){
                pricePerDay=22.5;
            }
        }
        totalPrice=pricePerDay*number;

        if(number>=30 && type.equals("Students")){
            totalPrice*=0.85;
        }else if(number>=100 && type.equals("Business")){
            totalPrice=pricePerDay*(number-10);
        }else if(type.equals("Regular") && number>=10 && number<=20){
            totalPrice*=0.95;
        }

        System.out.printf("Total price: %.2f",totalPrice);
    }
}
