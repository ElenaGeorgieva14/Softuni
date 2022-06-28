import java.util.*;

public class Largest3Numbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] numbers= Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer :: parseInt).toArray();

        Map<Integer,Integer> largestNumbers=new TreeMap<>(Collections.reverseOrder());
        for (int i = 1; i <= numbers.length; i++) {
            largestNumbers.putIfAbsent(numbers[i-1],i);
        }
        Set<Map.Entry<Integer,Integer>> entries=largestNumbers.entrySet();

        if(largestNumbers.size()>=3){
            int counter=0;
            for(var entry: entries){
                if (counter<3) {
                    System.out.print(entry.getKey() + " ");
                    counter++;
                }
            }

        }else{
            for(var entry: entries){
                System.out.print(entry.getKey()+" ");
            }
        }

    }
}
