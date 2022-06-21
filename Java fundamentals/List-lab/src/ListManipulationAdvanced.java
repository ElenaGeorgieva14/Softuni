import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String command = input.split(" ")[0];

            switch (command) {
                case "Contains":
                    int number = Integer.parseInt(input.split(" ")[1]);
                    checkContains(number, numbers);
                    break;
                case "Print":
                    String numType = input.split(" ")[1];
                    if (numType.equals("even")) {
                        printEvenNumbers(numbers);
                    } else if (numType.equals("odd")) {
                        printOddNumbers(numbers);
                    }
                    break;
                case "Get":
                    sumAllElements(numbers);
                    break;
                case "Filter":
                    String condition = input.split(" ")[1];
                    int conditionNumber = Integer.parseInt(input.split(" ")[2]);
                    switch (condition) {
                        case "<":
                            isSmaller(numbers,conditionNumber);
                            break;
                        case ">":
                            isBigger(numbers,conditionNumber);
                            break;
                        case ">=":
                            isBiggerOrEqual(numbers,conditionNumber);
                            break;
                        case "<=":
                            isSmallerOrEqual(numbers,conditionNumber);
                            break;
                    }
                    break;
            }
            input = scanner.nextLine();
        }
    }

    public static void checkContains(int number, List<Integer> numbers) {
        if (numbers.contains(number)) {
            System.out.println("Yes");
        } else {
            System.out.println("No such number");
        }
    }

    public static void printEvenNumbers(List<Integer> numbers) {
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }

    public static void printOddNumbers(List<Integer> numbers) {
        for (Integer number : numbers) {
            if (number % 2 != 0) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }

    public static void sumAllElements(List<Integer> numbers) {
        long sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println(sum);
    }

    public static void isSmaller(List<Integer> numbers, int number) {
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) < number) {
                System.out.print(numbers.get(i) + " ");
            }
        }
        System.out.println();
    }

    public static void isBigger(List<Integer> numbers,  int number) {
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) > number) {
                System.out.print(numbers.get(i) + " ");
            }
        }
        System.out.println();
    }

    public static void isSmallerOrEqual(List<Integer> numbers, int number){
        for (int i = 0; i < numbers.size(); i++) {
            if(numbers.get(i)<=number){
                System.out.print(numbers.get(i)+" ");
            }
        }
        System.out.println();
    }

    public static void isBiggerOrEqual(List<Integer> numbers, int number){
        for (int i = 0; i < numbers.size(); i++) {
            if(numbers.get(i)>=number){
                System.out.print(numbers.get(i)+" ");
            }
        }
        System.out.println();
    }
}
