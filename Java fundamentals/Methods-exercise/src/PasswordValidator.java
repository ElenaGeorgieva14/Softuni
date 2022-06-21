import java.util.Scanner;

public class PasswordValidator {
 public static boolean passwordLength(String password){
     boolean isRightLength=false;
     if(password.length()>=6 && password.length()<=10){
         isRightLength=true;
     }
     return isRightLength;
 }

 public static boolean hasOnlyDigitsAndLetters(String password){
     boolean hasOnlyDigitsAndLetters=false;
     for (int i = 0; i < password.length() ; i++) {
         char currentLetter=password.charAt(i);
         if((currentLetter>=48 && currentLetter<=57) ||
                 (currentLetter >=65 && currentLetter<=90) ||
                 (currentLetter>=97 && currentLetter<=122)){
             hasOnlyDigitsAndLetters=true;
         }else{
             hasOnlyDigitsAndLetters=false;
             break;
         }
     }
     return hasOnlyDigitsAndLetters;
    }

    public static boolean have2Digits(String password){
     boolean have2Digits=false;
     int digitsCounter=0;

        for (int i = 0; i < password.length(); i++) {
            char currentLetter=password.charAt(i);
            if(currentLetter>=48 && currentLetter<=57){
                digitsCounter++;
            }
        }
        if (digitsCounter>=2){
            have2Digits=true;
        }
     return have2Digits;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String password= scanner.nextLine();

       if(passwordLength(password) && hasOnlyDigitsAndLetters(password) && have2Digits(password)){
           System.out.println("Password is valid");
       }else {

           if (!passwordLength(password)) {
               System.out.println("Password must be between 6 and 10 characters");
           }
           if (!hasOnlyDigitsAndLetters(password)) {
               System.out.println("Password must consist only of letters and digits");
           }

           if (!have2Digits(password)) {
               System.out.println("Password must have at least 2 digits");
           }
       }
    }
}
