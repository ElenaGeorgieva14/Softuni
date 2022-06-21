import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CarRace {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<Integer> time = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer :: parseInt).collect(Collectors.toList());
        double leftTime=0.0;
        double rightTime=0.0;
        String winner="";

        for (int i = 0; i < (time.size()-1)/2; i++) {
            leftTime+=time.get(i);
            if(time.get(i)==0){
                leftTime*=0.8;
            }
        }

        for (int i = time.size()-1; i > (time.size()-1)/2; i--) {
            rightTime+=time.get(i);
            if(time.get(i)==0){
                rightTime*=0.8;
            }
        }

        double winnerTime=0.0;
        if(leftTime<rightTime){
            winner="left";
            winnerTime=leftTime;
        }else{
            winner="right";
            winnerTime=rightTime;
        }
        System.out.printf("The winner is %s with total time: %.1f",winner,winnerTime);
    }
}
