import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> firstHand = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondHand = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());


        while (firstHand.size() != 0 && secondHand.size() != 0) {
            int firstCard = firstHand.get(0);
            int secondCard = secondHand.get(0);

            if (firstCard > secondCard) {
                firstHand.add(firstCard);
                firstHand.add(secondCard);
                firstHand.remove(0);
                secondHand.remove(0);

            } else if (firstCard < secondCard) {
                secondHand.add(secondCard);
                secondHand.add(firstCard);
                secondHand.remove(0);
                firstHand.remove(0);
            } else {
                secondHand.remove(0);
                firstHand.remove(0);
            }
        }
        int sum = 0;
        if (firstHand.size() != 0) {
            for (int i = 0; i < firstHand.size(); i++) {
                sum += firstHand.get(i);
            }
            System.out.printf("First player wins! Sum: %d", sum);
        } else {
            for (int i = 0; i < secondHand.size(); i++) {
                sum += secondHand.get(i);
            }
            System.out.printf("Second player wins! Sum: %d", sum);
        }
    }
}



