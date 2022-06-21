
import java.util.ArrayDeque;
import java.util.Scanner;

public class ReverseNumbersWithStack {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] numbers=scanner.nextLine().split(" ");

        ArrayDeque<String> stack=new ArrayDeque<>() ;
        for (int i = 0; i < numbers.length; i++) {
            stack.push(numbers[i]);
        }

        for (String s : stack) {
            System.out.print(stack.pop()+" ");
        }
    }
}
