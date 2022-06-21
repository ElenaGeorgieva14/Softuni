import java.util.Scanner;

public class PalindromeIntegers {

    public static boolean checkIfPalindrome(String number){
        boolean isPalindrome=false;
        if(number.length()>1) {
            for (int i = 0; i < number.length() / 2; i++) {
                if (number.charAt(i) == number.charAt(number.length() - i - 1)) {
                    isPalindrome = true;
                } else {
                    isPalindrome = false;
                    break;
                }
            }
        }else{
            isPalindrome=true;
        }
        return isPalindrome;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();

        while(!input.equals("END")){
            if(checkIfPalindrome(input)){
                System.out.println("true");
            }else{
                System.out.println("false");
            }
            input=scanner.nextLine();
        }
    }
}
