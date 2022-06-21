import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int day=Integer.parseInt(scanner.nextLine());

        String[] daysOfWeek=new String[7];
        daysOfWeek[0]="Monday";
        daysOfWeek[1]="Tuesday";
        daysOfWeek[2]="Wednesday";
        daysOfWeek[3]="Thursday";
        daysOfWeek[4]="Friday";
        daysOfWeek[5]="Saturday";
        daysOfWeek[6]="Sunday";

        if(day>=1 && day<=7){
            System.out.println(daysOfWeek[day-1]);
        }
        else{
            System.out.println("Invalid day!");
        }
    }
}
