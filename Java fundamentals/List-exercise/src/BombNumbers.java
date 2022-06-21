import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> bombs = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        int bombNumber = bombs.get(0);
        int power = bombs.get(1);

        while (numbers.contains(bombNumber)) {
            int bombIndex=numbers.indexOf(bombNumber);
            int start=Math.max(bombIndex-power,0);
            int end=Math.min(bombIndex+power,numbers.size()-1);

            for (int i = start; i <=end ; i++) {
                numbers.remove(start);
            }
        }
        int sum=0;
        for(int number:numbers){
            sum+=number;
        }
        System.out.println(sum);
    }
}
