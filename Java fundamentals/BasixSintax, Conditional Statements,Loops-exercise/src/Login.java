import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        String password = scanner.nextLine();

        int lettersInUser = username.length();
        String correctPassword = "";

        for (int i = lettersInUser - 1; i >= 0; i--) {
            correctPassword += username.charAt(i);
        }

        int count = 0;

        while (true) {

            if (count == 3) {
                System.out.printf("User %s blocked!", username);
                break;
            }
            if (!correctPassword.equals(password)) {
                System.out.println("Incorrect password. Try again.");
                password = scanner.nextLine();
            } else {
                System.out.printf("User %s logged in.", username);
                break;
            }

            count++;

        }

    }
}
