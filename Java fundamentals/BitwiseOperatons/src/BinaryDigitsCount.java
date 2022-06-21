import java.util.Scanner;

public class BinaryDigitsCount {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n =Integer.parseInt(scanner.nextLine());
        int b=Integer.parseInt(scanner.nextLine());
        String binaryNum="";
        String bLetter=b+"";
        while(n/2>0){
            int reminder=n%2;
            n/=2;

            binaryNum += reminder+"";
        }
        binaryNum +=n+"";

        int counter=0;
        for (int i = 0; i < binaryNum.length(); i++) {
            if(binaryNum.charAt(i) == bLetter.charAt(0)){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
