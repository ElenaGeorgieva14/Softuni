import javax.swing.*;
import java.util.Scanner;

public class RepeatString {
    public static String RepeatingString(String text, int number){
        String repeatedString="";
        for (int i = 0; i < number; i++) {
            repeatedString+= String.join("",text);
        }
        return  repeatedString;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        int repeatedTimes=Integer.parseInt(scanner.nextLine());
        System.out.println(RepeatingString(input,repeatedTimes));
    }
}
