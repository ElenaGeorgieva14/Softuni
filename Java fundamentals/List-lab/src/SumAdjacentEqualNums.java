import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumAdjacentEqualNums {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<Double> numbers=  Arrays.stream(scanner.nextLine().split(" ")).map(Double :: parseDouble).collect(Collectors.toList());
        boolean areEquals=true;
        while(areEquals && numbers.size()>1) {
            for (int i = 1; i < numbers.size(); i++) {
                if (numbers.get(i).equals(numbers.get(i - 1))) {
                    numbers.set(i - 1, numbers.get(i) + numbers.get(i - 1));
                    numbers.remove(i);
                    areEquals = true;
                    break;
                } else {
                    areEquals = false;
                }
            }
        }
        printList(numbers);
    }
    public static void printList(List<Double>list){
        String output ="";
        for(double item : list){
            output += (new DecimalFormat("0.#").format(item)+" ");
        }
        System.out.println(output);
    }
}
