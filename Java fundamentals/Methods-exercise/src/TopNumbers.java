import java.util.Scanner;

public class TopNumbers {
    public static void printTopNumbers(int number){

        for (int i = 1; i <= number; i++) {
            String fakeNumber=i+"";
            int sum=0;
            boolean hasOddDigit=false;
            for (int j = 0; j < fakeNumber.length(); j++) {
              char fakeDigit=fakeNumber.charAt(j);
              int digit=Integer.parseInt(String.valueOf(fakeDigit));
              sum+=digit;
              if(digit%2!=0 ){
                  hasOddDigit=true;
                }
            }
            if(sum%8==0 && hasOddDigit){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number=Integer.parseInt(scanner.nextLine());
        printTopNumbers(number);
    }
}
