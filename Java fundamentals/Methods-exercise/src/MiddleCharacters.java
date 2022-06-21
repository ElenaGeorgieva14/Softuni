import java.util.Scanner;

public class MiddleCharacters {
    public static void printMiddleCharacter(String text){
        int length=text.length();
        if(length%2==0){
            System.out.print(text.charAt(length/2-1));
            System.out.print(text.charAt(length/2));
        }else{
            System.out.print(text.charAt(length/2));
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input = scanner.nextLine();
        printMiddleCharacter(input);
    }
}
