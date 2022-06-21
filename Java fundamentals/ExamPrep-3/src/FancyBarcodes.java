import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FancyBarcodes {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int lines=Integer.parseInt(scanner.nextLine());

        Pattern pattern=Pattern.compile("@#+(?<barcode>[A-Z][A-Za-z0-9]{4,}[A-Z])@#+");

        for (int i = 0; i < lines; i++) {
            String input=scanner.nextLine();
            Matcher matcher=pattern.matcher(input);
            if(matcher.find()){
                String group="";
                String barcode=matcher.group("barcode");
                for (int j = 0; j <barcode.length() ; j++) {
                    if(barcode.charAt(j)>=48 && barcode.charAt(j)<=57){
                        group+=barcode.charAt(j);
                    }
                }

                if(group.equals("")){
                    group="00";
                }
                System.out.printf("Product group: %s%n",group);
            }else{
                System.out.println("Invalid barcode");
            }
        }
    }
}
