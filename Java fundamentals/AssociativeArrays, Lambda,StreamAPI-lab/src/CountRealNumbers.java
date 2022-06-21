import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collectors;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double[] numbers= Arrays.stream(scanner.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
        TreeMap<Double,Integer> counts=new TreeMap<>();

        for(double num :numbers){
            if(!counts.containsKey(num)){
                counts.put(num,1);
            }
            else{
                counts.put(num, counts.get(num)+1);
            }
        }

        for(Map.Entry<Double,Integer> entry:counts.entrySet()){
            DecimalFormat df=new DecimalFormat("#.#######");
            System.out.printf("%s -> %d%n",df.format(entry.getKey()), entry.getValue());
        }
    }
}
