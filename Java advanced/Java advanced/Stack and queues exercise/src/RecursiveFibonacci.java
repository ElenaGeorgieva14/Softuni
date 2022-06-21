import java.util.ArrayDeque;
import java.util.Scanner;

public class RecursiveFibonacci {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number=Integer.parseInt(scanner.nextLine());
        ArrayDeque<Long> queue=new ArrayDeque<>();

        if(number==1){
            System.out.println("1");
        }else{
            queue.push((long)1);
            queue.push((long)1);
            number-=2;
            for (int i = 0; i <= number; i++) {
                long lastElement=queue.pop();
                long lastestElement=queue.peek();
                queue.push(lastElement);
                queue.offer((lastElement+lastestElement));
                queue.poll();
            }
            queue.poll();
            System.out.println(queue.peek());
        }



    }

}