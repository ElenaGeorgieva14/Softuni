import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PokemonDontGo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<Integer> distances= Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer :: parseInt).collect(Collectors.toList());
        int sum=0;
        while(distances.size()!=0){
           int index=Integer.parseInt(scanner.nextLine());
           int removedElement=0;
           if(index<0){
               removedElement=distances.get(0);
               distances.remove(0);
               distances.add(0,distances.get(distances.size()-1));
           }else if(index>=distances.size()){
                removedElement=distances.get(distances.size()-1);
                distances.remove(distances.size()-1);
                distances.add(distances.size(),distances.get(0));
           }else {
               removedElement = distances.get(index);
               distances.remove(index);
           }
            updateList(distances, removedElement);
           sum+=removedElement;
        }
        System.out.println(sum);
    }

    public static void updateList(List<Integer> numbers,int removedNumber){
        for (int i = 0; i < numbers.size(); i++) {
            if(numbers.get(i)<=removedNumber){
                numbers.set(i,numbers.get(i)+removedNumber);
            }else{
                numbers.set(i,numbers.get(i)-removedNumber);
            }
        }
    }
}
