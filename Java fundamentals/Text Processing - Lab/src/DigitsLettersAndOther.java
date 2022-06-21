import java.util.Scanner;

public class DigitsLettersAndOther {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input= scanner.nextLine();

        String digits="";
        String letters="";
        String other="";
        for (int i = 0; i < input.length(); i++) {
            if(isDigit(input.charAt(i))){
                digits+=input.charAt(i);
            }else if(isLetter(input.charAt(i))){
                letters+=input.charAt(i);
            }else{
                other+=input.charAt(i);
            }
        }

        System.out.println(digits);
        System.out.println(letters);
        System.out.println(other);
    }

    private static boolean isDigit(char a){
        boolean isDigit=false;
        if(a>=48 && a<=57 ){
            isDigit=true;
        }
        return isDigit;
    }

    private static boolean isLetter(char a){
        boolean isLetter=false;
        if((a>=65 && a<=90) || (a>=97 && a<=122) ){
            isLetter=true;
        }
        return isLetter;
    }
}
