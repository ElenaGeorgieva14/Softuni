package genericCountMethodString;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int elementsCount=Integer.parseInt(scanner.nextLine());

        List<String> elements=new ArrayList<>();

        for (int i = 0; i < elementsCount; i++) {
            String element=scanner.nextLine();
            elements.add(element);
        }

        Box box=new Box(elements);

        String elementToCompare=scanner.nextLine();

        int count=box.count(elementToCompare);
        System.out.println(count);
    }
}
