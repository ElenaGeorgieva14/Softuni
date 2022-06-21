import java.util.ArrayDeque;
import java.util.Scanner;

public class MathPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int potato = Integer.parseInt(scanner.nextLine());

        String[] kids = input.split(" ");
        ArrayDeque<String> queue = new ArrayDeque<>();

        for (int i = 0; i < kids.length; i++) {
            queue.offer(kids[i]);
        }

        while (queue.size() != 1) {
            for (int i = 1; i < potato; i++) {
                if (i <= potato - 1) {
                    String kid = queue.poll();
                    queue.offer(kid);
                } else if (i == potato) {
                    String removed = queue.poll();
                    System.out.println("Removed " + removed);
                }
            }
        }
        System.out.println("Last is " + queue.poll());
    }
}


