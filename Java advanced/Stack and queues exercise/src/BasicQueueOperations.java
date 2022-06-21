import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] operations =scanner.nextLine().split(" ");

        int elementsToAdd=Integer.parseInt(operations[0]);
        int elementsToRemove=Integer.parseInt(operations[1]);
        int elementToCheck=Integer.parseInt(operations[2]);

        String[] numbers=scanner.nextLine().split(" ");
        ArrayDeque<Integer> queue=new ArrayDeque<>();

        for (int i = 0; i < elementsToAdd; i++) {
            queue.offer(Integer.parseInt(numbers[i]));
        }

        for (int i = 0; i < elementsToRemove; i++) {
            queue.poll();
        }

        if(queue.contains(elementToCheck) && !queue.isEmpty()){
            System.out.println("true");
        }else if(queue.isEmpty()){
            System.out.println("0");
        }else{
            System.out.println(Collections.min(queue));
        }
    }
}
