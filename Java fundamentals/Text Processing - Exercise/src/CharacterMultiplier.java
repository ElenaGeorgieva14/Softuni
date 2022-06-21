import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String text1=scanner.next();
        String text2=scanner.next();

        int sum=0;
        if(text1.length()<text2.length()){
            for (int i = 0; i < text1.length(); i++) {
                int currentSum=text1.charAt(i)*text2.charAt(i);
                sum+=currentSum;
            }
            for (int i = text1.length(); i < text2.length(); i++) {
                sum+=text2.charAt(i);
            }
        }else{
            for (int i = 0; i < text2.length(); i++) {
                int currentSum=text1.charAt(i)*text2.charAt(i);
                sum+=currentSum;
            }

            for (int i = text2.length(); i < text1.length(); i++) {
                sum+=text1.charAt(i);
            }
        }
        System.out.println(sum);
    }
}
