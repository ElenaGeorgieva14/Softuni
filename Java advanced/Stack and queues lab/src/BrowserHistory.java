import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String lastElement = "";

        ArrayDeque<String> stack = new ArrayDeque<>();

        while (!input.equals("Home")) {
            if (input.equals("back")) {
                if (!stack.isEmpty()) {
                    lastElement = stack.pop();

                } else {
                    System.out.println("no previous URLs");
                    input = scanner.nextLine();
                    continue;
                }

            } else {
                if (!lastElement.equals("")) {
                    stack.push(lastElement);
                }
                lastElement=input;
            }
            System.out.println(lastElement);
            input = scanner.nextLine();
        }

    }


}