import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double money=Double.parseDouble(scanner.nextLine());
        int students=Integer.parseInt(scanner.nextLine());
        double sabersPrice=Double.parseDouble(scanner.nextLine());
        double robesPrice=Double.parseDouble(scanner.nextLine());
        double beltsPrice=Double.parseDouble(scanner.nextLine());

        sabersPrice=(Math.ceil(students*1.1))*sabersPrice;
        robesPrice=students*robesPrice;

        beltsPrice=(students-students/6)*beltsPrice;

        double total=0.0;
        total=sabersPrice+robesPrice+beltsPrice;

        if(total<=money){
            System.out.printf("The money is enough - it would cost %.2flv.",total);
        }else{
            System.out.printf("George Lucas will need %.2flv more.",total-money);
        }
    }
}
