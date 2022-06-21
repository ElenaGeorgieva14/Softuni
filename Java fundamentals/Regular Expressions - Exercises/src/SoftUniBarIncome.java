import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUniBarIncome {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input =scanner.nextLine();

        String regex="%(?<name>[A-Z][a-z]+)%[^|$.]*?<(?<product>\\w+)>[^|$.]*?\\|(?<quantity>\\d+)\\|[^|$.]*?(?<price>\\d+\\.?\\d*)\\$[^|$.]*?";
        Pattern pattern=Pattern.compile(regex);

        double total=0.0;
        while(!input.equals("end of shift")){
            Matcher matcher=pattern.matcher(input);
            if(matcher.find()){
                String name=matcher.group("name");
                String product=matcher.group("product");
                double totalPrice=Integer.parseInt(matcher.group("quantity"))* Double.parseDouble(matcher.group("price"));
                total+=totalPrice;
                System.out.printf("%s: %s - %.2f%n",name,product,totalPrice);
            }

            input=scanner.nextLine();
        }

        System.out.printf("Total income: %.2f",total);
    }
}
