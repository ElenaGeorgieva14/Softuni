import java.util.*;

public class ListOfProducts {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int lines=Integer.parseInt(scanner.nextLine());
        List<String> products = new ArrayList<>();

        for (int i = 0; i <lines; i++) {
            products.add(scanner.nextLine());
        }

        Collections.sort(products);

        for (int i = 0; i < lines; i++) {
            System.out.println(i+1 +"." +products.get(i));
        }
    }
}
