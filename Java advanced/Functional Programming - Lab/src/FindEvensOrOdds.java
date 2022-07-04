import java.util.Scanner;
import java.util.function.Predicate;

public class FindEvensOrOdds {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] data=scanner.nextLine().split(" ");
        int lowerBound=Integer.parseInt(data[0]);
        int upperBound=Integer.parseInt(data[1]);

        String type=scanner.nextLine();
        Predicate<Integer> predicate= choosePredicate(type);

        for (int i = lowerBound; i <= upperBound; i++) {
            if(predicate.test(i)){
                System.out.print(i+" ");
            }
        }
    }

    private static Predicate<Integer> choosePredicate(String type) {
        Predicate<Integer> thisPredicate=null;

        switch (type){
            case "even":
                thisPredicate = x-> x%2 ==0;
                break;
            case "odd":
                thisPredicate = x ->x%2 !=0;
                break;
        }

        return thisPredicate;
    }
}
