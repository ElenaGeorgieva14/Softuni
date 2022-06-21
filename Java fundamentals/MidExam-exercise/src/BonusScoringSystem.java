import java.util.Scanner;

public class BonusScoringSystem {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int students=Integer.parseInt(scanner.nextLine());
        int lectures=Integer.parseInt(scanner.nextLine());
        int additionalBonus=Integer.parseInt(scanner.nextLine());
        double maxBonus=Double.MIN_VALUE;
        int maxIndex=-1;
        if(students>0 && lectures>0 && additionalBonus>0) {
            int[] attendances = new int[students];
            double[] totalBonuses = new double[students];
            for (int i = 0; i < students; i++) {
                attendances[i] = Integer.parseInt(scanner.nextLine());
                totalBonuses[i] = attendances[i] * 1.0 / lectures * (5 + additionalBonus);
            }

            for (int i = 0; i < totalBonuses.length; i++) {
                if (totalBonuses[i] >= maxBonus) {
                    maxBonus = totalBonuses[i];
                    maxIndex = i;
                }
            }
            System.out.printf("Max Bonus: %.0f.%n", Math.ceil(maxBonus));
            System.out.printf("The student has attended %d lectures.", attendances[maxIndex]);
        }else{
            System.out.printf("Max Bonus: 0.%n");
            System.out.printf("The student has attended 0 lectures.");
        }
    }
}
