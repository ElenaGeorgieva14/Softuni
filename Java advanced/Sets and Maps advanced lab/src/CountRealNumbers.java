import java.util.*;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double[] numbers= Arrays.stream(scanner.nextLine().split(" ")).mapToDouble(Double :: parseDouble).toArray();

        Map<Double,Integer> countNumbers=new LinkedHashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            if(countNumbers.containsKey(numbers[i])){
                countNumbers.put(numbers[i],countNumbers.get(numbers[i])+1);
            }
            countNumbers.putIfAbsent(numbers[i],1);
        }

        Set<Map.Entry<Double,Integer>> entries=countNumbers.entrySet();
        for(var entry : entries){
            System.out.printf("%.1f -> %d%n",entry.getKey(),entry.getValue());
        }
    }
}
