import java.util.Scanner;

public class AsciiSumator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        char symbol1=scanner.nextLine().charAt(0);
        char symbol2=scanner.nextLine().charAt(0);
        String text= scanner.nextLine();

        int sum=0;
        for (int i = 0; i < text.length(); i++) {
            if(text.charAt(i)>symbol1 && text.charAt(i)<symbol2){
                sum+=text.charAt(i);
            }
        }
        System.out.println(sum);
    }
}
