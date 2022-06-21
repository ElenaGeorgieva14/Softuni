
import java.util.Scanner;

public class TextFilter {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] banned=scanner.nextLine().split(", ");
        String text=scanner.nextLine();
        for (int i = 0; i <banned.length ; i++) {
            if(text.contains(banned[i])){
                String replacement=repeatStr("*",banned[i].length());
                text=text.replace(banned[i],replacement);
            }
        }

        System.out.println(text);
    }

    private static String repeatStr(String str,int length){
        String replacement="";
        for (int i = 0; i < length; i++) {
            replacement+=str;
        }
        return replacement;
    }
}
