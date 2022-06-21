import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String [] inputs=scanner.nextLine().split(" ");
        int elementsToPush=Integer.parseInt(inputs[0]);
        int elementsToPop=Integer.parseInt(inputs[1]);
        int checkIfExists=Integer.parseInt(inputs[2]);

        String[] numbers=scanner.nextLine().split(" ");

        ArrayDeque<Integer> stack=new ArrayDeque<>();
        for (int i = 0; i < elementsToPush; i++) {
            stack.push(Integer.parseInt(numbers[i]));
        }

        for (int i = 0; i < elementsToPop; i++) {
            stack.pop();
        }

        if(stack.contains(checkIfExists) && !stack.isEmpty()){
            System.out.println("true");
        }else if(stack.isEmpty()){
            System.out.println("0");
        }
        else{
            System.out.println(Collections.min(stack));
        }

    }
}
