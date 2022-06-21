import java.util.Locale;
import java.util.Scanner;

public class VowelsCount {
    public static void PrintVowels (String text){
        int vowelsCounter=0;
        for (int i = 0; i < text.length(); i++) {
            char currentLetter=text.toLowerCase().charAt(i);

            if(currentLetter=='a' || currentLetter =='e' || currentLetter=='o' ||
                    currentLetter =='u' || currentLetter == 'y' || currentLetter == 'i'){
                    vowelsCounter++;
            }
        }
        System.out.println(vowelsCounter);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        PrintVowels(input);
    }
}
