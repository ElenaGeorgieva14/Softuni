import java.util.ArrayDeque;
import java.util.Scanner;

public class PoisonousPlants {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int numberOfPlants=Integer.parseInt(scanner.nextLine());
        String[] input=scanner.nextLine().split(" ");

        ArrayDeque<Integer> compare=new ArrayDeque<>();
        ArrayDeque<Integer> newQueue=new ArrayDeque<>();

        for (int i = 0; i < input.length; i++) {
            compare.offer(Integer.parseInt(input[i]));
        }

        boolean notRemove=true;
        int oldSize=compare.size();
        int newSize= 0;
        int days=0;

        while(oldSize!=newSize){
            if(compare.isEmpty()){
                oldSize=newQueue.size();
                newSize=0;
                days++;
                for (int i = newQueue.size(); i >0; i--) {
                    compare.offer(newQueue.poll());
                    //  newQueue.poll();
                }
            }
            int firstNum=compare.poll();
            int secondNum=0;
            if(compare.size()>=1) {
                secondNum = compare.peek();
            }

            if(notRemove) {
                newQueue.offer(firstNum);
                newSize++;
            }

            if(firstNum>=secondNum){
                notRemove=true;
            }else{
                notRemove=false;
            }

        }
        System.out.println(days);
    }


}
