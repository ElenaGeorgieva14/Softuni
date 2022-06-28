import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Voina {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        Set<Integer> firstPlayer=new LinkedHashSet<>();
        Set<Integer> secondPlayer=new LinkedHashSet<>();

        int[] firstPlayerCards= Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer :: parseInt).toArray();
        int[] secondPlayerCards= Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer :: parseInt).toArray();

        for (int i = 0; i < firstPlayerCards.length; i++) {
            firstPlayer.add(firstPlayerCards[i]);
        }

        for (int i = 0; i < secondPlayerCards.length; i++) {
            secondPlayer.add(secondPlayerCards[i]);
        }

        int rounds=0;

        while(!firstPlayer.isEmpty()&& !secondPlayer.isEmpty()){
            if(rounds==50){
                break;
            }
            int firstNumber=firstPlayer.iterator().next();
            firstPlayer.remove(firstNumber);

            int secondNumber=secondPlayer.iterator().next();
            secondPlayer.remove(secondNumber);

            if(firstNumber>secondNumber){
                firstPlayer.add(firstNumber);
                firstPlayer.add(secondNumber);
            }else if(firstNumber<secondNumber){
                secondPlayer.add(firstNumber);
                secondPlayer.add(secondNumber);
            }
            rounds++;
        }
        if(secondPlayer.isEmpty()){
            System.out.println("First player win!");
        }else if(firstPlayer.isEmpty()){
            System.out.println("Second player win!" );
        }else if(secondPlayer.size()>firstPlayer.size()){
            System.out.println("Second player win!" );
        }else if(secondPlayer.size()<firstPlayer.size()){
            System.out.println("First player win!");
        }
        else {
            System.out.println("Draw!");
        }

    }
}
