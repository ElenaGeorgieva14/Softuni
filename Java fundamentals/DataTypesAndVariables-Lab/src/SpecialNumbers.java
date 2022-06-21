import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
       String input=scanner.nextLine();
       int number=Integer.parseInt(input);

        for (int i = 1; i <=number ; i++) {
            int sum=0;
            String currentNum=i+"";
            for (int j = 0; j < currentNum.length(); j++) {
                int digit=Integer.parseInt(String.valueOf(currentNum.charAt(j)));
                sum+=digit;
            }
            if(sum==5 || sum==7 || sum==11){
                System.out.printf("%d -> True%n",i);
            }else {
                System.out.printf("%d -> False%n",i);
            }

        }
    }
}
