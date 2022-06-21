import java.util.Scanner;

public class PasswordReset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder text = new StringBuilder(scanner.nextLine());
        String input = scanner.nextLine();

        while (!input.equals("Done")) {
            String[] data = input.split("\\s+");
            String command = data[0];

            switch (command) {
                case "TakeOdd":
                    text = createNewPass(text);
                    System.out.println(text);
                    break;
                case "Cut":
                    int index = Integer.parseInt(data[1]);
                    int length = Integer.parseInt(data[2]);
                    cut(text, index, length);
                    System.out.println(text);
                    break;
                case "Substitute":
                    String substring=data[1];
                    String substitute=data[2];
                    substitute(text,substring,substitute);
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.printf(	"Your password is: %s",text);

    }

    private static StringBuilder createNewPass(StringBuilder text) {
        StringBuilder newPass = new StringBuilder();

        for (int i = 1; i < text.length(); i += 2) {
            newPass.append(text.charAt(i));
        }
        return newPass;
    }

    private static void cut(StringBuilder text, int index, int length) {
        boolean isFirst = false;
        String substring = text.substring(index, index + length);
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == substring.charAt(0)) {
                for (int j = 0; j < substring.length(); j++) {
                    if (text.charAt(j + i) != substring.charAt(j)) {
                        isFirst = false;
                        break;
                    } else {
                        isFirst = true;
                    }
                }
                if (isFirst) {
                    text.replace(i, i + substring.length(), "");
                    isFirst=false;
                    break;
                }
            }
        }


    }

    private static void substitute(StringBuilder text, String substring, String substitute) {
        boolean isFirst = false;
        boolean isChanged=false;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == substring.charAt(0)) {
                for (int j = 0; j < substring.length(); j++) {
                    if (text.charAt(j + i) != substring.charAt(j)) {
                        isFirst = false;
                        break;
                    } else {
                        isFirst = true;
                    }
                }
                if (isFirst) {
                    text.replace(i, i + substring.length(), substitute);
                    isChanged=true;
                    isFirst=false;
                }
            }
        }
        if(!isChanged){
            System.out.println("Nothing to replace!");
        }else{
            System.out.println(text);
        }
    }
}