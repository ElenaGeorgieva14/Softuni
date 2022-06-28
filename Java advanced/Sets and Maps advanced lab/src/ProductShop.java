import com.sun.source.tree.Tree;

import java.util.*;

public class ProductShop {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();

        Map<String, Map<String ,Double>> shopProducts=new TreeMap<>();

        while(!input.equals("Revision")){
            String[] data=input.split(", ");
            String shop=data[0];
            String product=data[1];
            double price=Double.parseDouble(data[2]);

            shopProducts.putIfAbsent(shop,new LinkedHashMap<>());
            shopProducts.get(shop).putIfAbsent(product,price);

            input=scanner.nextLine();
        }

        Set<Map.Entry<String ,Map<String,Double>>> entries= shopProducts.entrySet();

        for(var entry: entries){
            System.out.printf("%s->%n",entry.getKey());
            Set<Map.Entry<String,Double>> productEntries=entry.getValue().entrySet();

            for(var productEntry : productEntries){
                System.out.printf("Product: %s, Price: %.1f%n",productEntry.getKey(),productEntry.getValue());
            }
        }
    }
}
