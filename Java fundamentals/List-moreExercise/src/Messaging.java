import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Messaging {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<Integer> numbers= Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String text=scanner.nextLine();
        String result="";

        for (int i = 0; i < numbers.size(); i++) {
            String element=numbers.get(i)+"";
            int sum=findSum(element);
            if(sum>text.length()){
                sum-=text.length();
            }
            result+=text.split("")[sum];
            text=text.replaceFirst(text.split("")[sum],"");

        }
        System.out.println(result);
    }

    public static int findSum(String element){
        int sum=0;
        for (int j = 0; j <element.length() ; j++) {
            int currentDigit=Integer.parseInt(element.split("")[j]);
            sum+=currentDigit;
        }
        return sum;
    }
}
