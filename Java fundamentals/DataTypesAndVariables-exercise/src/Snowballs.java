import java.util.Scanner;

public class Snowballs {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int numbers=Integer.parseInt(scanner.nextLine());
        double maxValue=0.0;
        int maxSnow=0;
        int maxTime=0;
        int maxQuality=0;

        for (int i = 0; i < numbers; i++) {
            int snow=Integer.parseInt(scanner.nextLine());
            int time = Integer.parseInt(scanner.nextLine());
            int quality=Integer.parseInt(scanner.nextLine());

            double value=Math.pow((snow/time),quality);
            if(value>maxValue){
                maxValue=value;
                maxSnow=snow;
                maxTime=time;
                maxQuality=quality;
            }
        }
        System.out.printf("%d : %d = %.0f (%d)",maxSnow,maxTime,maxValue,maxQuality);
    }
}
