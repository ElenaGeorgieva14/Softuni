import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] setsLengths= Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer :: parseInt).toArray();

        Set<Integer> firstSet=new LinkedHashSet<>();
        Set<Integer> secondSet=new LinkedHashSet<>();


        for (int i = 0; i <setsLengths[0] ; i++) {
            int number=Integer.parseInt(scanner.nextLine());
            firstSet.add(number);
        }

        for (int i = 0; i <setsLengths[1] ; i++) {
            int number=Integer.parseInt(scanner.nextLine());
            secondSet.add(number);
        }

        firstSet.retainAll(secondSet);

        for(int number : firstSet){
            System.out.print(number+" ");
        }
    }
}
