import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String text1=scanner.nextLine();
        String text2=scanner.nextLine();


        for (int i = 0; i < text2.length(); i++) {
            String letter=text2.charAt(i)+"";
            if(text1.contains(letter)){
                text2=text2.replace(letter,"");
            }

        }

        System.out.println(text2);
    }
}
