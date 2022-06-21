import java.util.Arrays;
import java.util.Scanner;

public class WordFilter {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] array= scanner.nextLine().split(" ");

        Arrays.stream(array)
                .filter(n -> n.length()%2==0)
                .forEach(n-> System.out.println(n));
    }
}
