import java.util.Scanner;

public class PokeMon {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int power=Integer.parseInt(scanner.nextLine());
        int distance=Integer.parseInt(scanner.nextLine());
        int exhaustion=Integer.parseInt(scanner.nextLine());

        int targetCounter=0;
        double halfPower=power*0.5;
        while(power>=distance){
            power-=distance;
            targetCounter++;
            if(power==halfPower && exhaustion!=0){
                power/=exhaustion;
            }
        }
        System.out.println(power);
        System.out.println(targetCounter);
    }
}
