import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String sentence=scanner.nextLine();
        String[] words= sentence.split(" ");

        Random random = new Random();
        for (int i = 0; i < words.length; i++) {
            int pos2= random.nextInt(words.length);
            String temp = words[i];
            words[i]=words[pos2];
            words[pos2]=temp;

        }
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }

    }
}
