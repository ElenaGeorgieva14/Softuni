import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<Integer> numbers= Arrays.stream(scanner.nextLine().split(" ")).map(Integer :: parseInt).collect(Collectors.toList());

        removeNegatives(numbers);
        Collections.reverse(numbers);
        printList(numbers);
    }
    public static void removeNegatives(List<Integer> numbers){
        for (int i = numbers.size()-1; i >=0; i--) {
            if(numbers.get(i)<0){
                numbers.remove(i);
            }
        }
    }
    public static void printList(List<Integer>numbers){
        if(numbers.size()<=0){
            System.out.println("empty");
        }else{
            for(int number:numbers){
                System.out.print(number+" ");
            }
        }
    }
}
