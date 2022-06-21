import java.util.Scanner;


public class RageExpenses {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int lostGames=Integer.parseInt(scanner.nextLine());
        double headsetPr=Double.parseDouble(scanner.nextLine());
        double mousePr=Double.parseDouble(scanner.nextLine());
        double keyboardPr= Double.parseDouble(scanner.nextLine());
        double displayPr=Double.parseDouble(scanner.nextLine());

        int headsetCounter=0;
        int mouseCounter=0;
        int keyboardCounter=0;
        int displayCounter=0;

        for (int i = 1; i <= lostGames; i++) {
            if(i%2==0){
                headsetCounter++;
            }
            if(i%3==0){
                mouseCounter++;
            }
            if(i%6==0){
                keyboardCounter++;
            }
        }
        for (int i = 1; i <=keyboardCounter; i++) {
            if(i%2==0){
                displayCounter++;
            }
        }
        double total=0.0;
        total=headsetCounter*headsetPr+mouseCounter*mousePr+keyboardCounter*keyboardPr+displayCounter*displayPr;
        System.out.printf("Rage expenses: %.2f lv.",total);
    }
}
