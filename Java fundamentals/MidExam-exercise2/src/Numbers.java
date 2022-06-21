import java.util.*;
import java.util.stream.Collectors;

public class Numbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List <Integer> numbers=Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        double average=sumAverage(numbers);
        List<Integer> greaterNumbers=findGreaterNumbers(numbers,average);
        Collections.sort(greaterNumbers);

        printGreaterNumbers(greaterNumbers);
    }

    public static double sumAverage(List<Integer> numbers){
        int sum=0;
        for (int number : numbers) {
            sum += number;
        }
        return sum*1.0/numbers.size();
    }

    public static List<Integer> findGreaterNumbers(List<Integer> numbers, double average){
        List<Integer> greaterNumbers= new ArrayList<Integer>();
        for (int i = 0; i < numbers.size(); i++) {
            if(numbers.get(i)>average){
                greaterNumbers.add(numbers.get(i));
            }
        }
        return  greaterNumbers;
    }

    public static void printGreaterNumbers(List<Integer>greaterNumbers){
       int counter=0;
        if(greaterNumbers.size()==0){
            System.out.println("No");
        }else{
            for (int i = greaterNumbers.size()-1; i >=0 ; i--) {
                if(counter<5) {
                    System.out.print(greaterNumbers.get(i) + " ");
                    counter++;
                }else{
                    break;
                }
            }
        }
    }
}
