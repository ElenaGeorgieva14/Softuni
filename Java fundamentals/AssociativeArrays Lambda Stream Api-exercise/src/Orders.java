import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Map<String,Double>productPrice=new LinkedHashMap<>();
        Map<String,Integer>productQuantity=new LinkedHashMap<>();
        String input=scanner.nextLine();

        while(!input.equals("buy")){
            String name=input.split(" ")[0];
            double price=Double.parseDouble(input.split(" ")[1]);
            int quantity=Integer.parseInt(input.split(" ")[2]);

            productPrice.putIfAbsent(name,0.0);
            productQuantity.putIfAbsent(name,0);
            productPrice.put(name,price);
            productQuantity.put(name,(productQuantity.get(name)+quantity));
            input=scanner.nextLine();
        }

        productPrice.forEach((key,value) -> System.out.printf("%s -> %.2f%n",key,value*productQuantity.get(key)));

    }
}
