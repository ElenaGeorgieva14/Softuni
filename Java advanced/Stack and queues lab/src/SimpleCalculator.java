import java.util.ArrayDeque;
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int sum=0;
        int num=0;

        String input=scanner.nextLine();
        ArrayDeque<String> queue=new ArrayDeque<>();

        String [] splittedInput=input.split(" ");
        for (int i = 0; i < splittedInput.length; i++) {
            queue.add(splittedInput[i]);
        }

        while(!queue.isEmpty()){
            String current=queue.pop();
            if(current.equals("+")){
                num=Integer.parseInt(queue.pop());
                sum+=num;
            }else if(current.equals("-")){
                num=Integer.parseInt(queue.pop());
                sum-=num;
            }else{
                if(sum==0) {
                    sum = Integer.parseInt(current);
                }
            }
        }
        System.out.println(sum);
    }
}
