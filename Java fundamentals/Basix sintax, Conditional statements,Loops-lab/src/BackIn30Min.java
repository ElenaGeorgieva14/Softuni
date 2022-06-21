import java.util.Scanner;

public class BackIn30Min {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours=Integer.parseInt(scanner.nextLine());
        int minutes=Integer.parseInt(scanner.nextLine());

        if(hours != 23&&minutes>=30){
            hours++;
            minutes-=60;
        }
        if(hours==23 && minutes>=30){
            hours=0;
            minutes-=60;
        }
        minutes+=30;
        if(minutes<10){
            System.out.printf("%d:0%d",hours,minutes );
        }else{
            System.out.printf("%d:%d",hours,minutes );
        }

    }
}
