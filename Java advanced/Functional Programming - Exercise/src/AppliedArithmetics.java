import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class AppliedArithmetics {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        List<Integer> numbers= Arrays.stream(scanner.nextLine().split(" ")).map(Integer :: parseInt).collect(Collectors.toList());

        UnaryOperator<List<Integer>> add= list -> list.stream().map(el ->el+1).collect(Collectors.toList());
        UnaryOperator<List<Integer>> multiply= list -> list.stream().map(el ->el*2).collect(Collectors.toList());
        UnaryOperator<List<Integer>> subtract = list -> list.stream().map(el -> el-1).collect(Collectors.toList());

        Function<List<Integer>,String> print= list -> list.stream().map(String :: valueOf).collect(Collectors.joining(" "));

        String input=scanner.nextLine();

        while(!input.equals("end")){

            switch (input){
                case "add":
                   numbers=add.apply(numbers);
                    break;
                case "multiply":
                    numbers=multiply.apply(numbers);
                    break;
                case "subtract":
                    numbers=subtract.apply(numbers);
                    break;
                case "print":
                    String printNumbers=print.apply(numbers);
                    System.out.println(printNumbers);
                    break;
            }

            input=scanner.nextLine();
        }
    }
}
