import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();

        Pattern pattern=Pattern.compile(">{2}(?<furniture>[A-Z][A-Za-z]+)<{2}(?<price>\\d+\\.*\\d*)!(?<quantity>\\d+)");

        List<String> furniture=new ArrayList<>();
        double totalPrice=0.0;

        while(!input.equals("Purchase")){
            Matcher matcher=pattern.matcher(input);

            if(matcher.find()){
                String name=matcher.group("furniture");
                furniture.add(name);
                double price=Double.parseDouble(matcher.group("price"));
                int quantity=Integer.parseInt(matcher.group("quantity"));
                totalPrice+= price*quantity;
            }
            input=scanner.nextLine();
        }

        System.out.println("Bought furniture:");
        for(String name:furniture){
            System.out.println(name);
        }

        System.out.printf("Total money spend: %.2f",totalPrice);
    }
}
