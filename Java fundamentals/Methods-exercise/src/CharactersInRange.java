import java.util.Scanner;

public class CharactersInRange {
    public static void PrintLetters (char start,char end){
        int startIndex= (int) start;
        int lastIndex= (int) end;
        if(start<lastIndex) {
            for (int i = startIndex + 1; i < lastIndex; i++) {
                System.out.print((char) i + " ");
            }
        }else{
            for (int i =end+1; i <start ; i++){
                System.out.print((char) i +" ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        char firstLetter=scanner.nextLine().charAt(0);
        char lastLetter=scanner.nextLine().charAt(0);

        PrintLetters(firstLetter,lastLetter);
    }

}
