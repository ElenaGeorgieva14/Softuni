import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int inputRows=Integer.parseInt(scanner.nextLine());

        Set<String> elements=new TreeSet<>();
        for (int i = 0; i < inputRows; i++) {
            String[] inputs=scanner.nextLine().split(" ");
            for (int j = 0; j < inputs.length; j++) {
                elements.add(inputs[j]);
            }
        }

        for (String element : elements){
            System.out.print(element+" ");
        }
    }
}
