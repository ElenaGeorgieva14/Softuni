package genericBoxOfInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int lines=Integer.parseInt(scanner.nextLine());

        List<Integer> values=new ArrayList<>();
        for (int i = 0; i < lines; i++) {
            int input=Integer.parseInt(scanner.nextLine());
            values.add(input);
        }

        Box <Integer>box=new Box(values);
        System.out.println(box.toString());
    }

}
