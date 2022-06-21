import java.util.Scanner;

public class DataType {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String dataType=scanner.nextLine();

        switch (dataType) {
            case "int":
                int number=Integer.parseInt(scanner.nextLine());
                System.out.println(editInput(number));
                break;
            case "real":
                double realNumber=Double.parseDouble(scanner.nextLine());
                System.out.printf("%.2f",editInput(realNumber));
                break;
            case "string":
                String text=scanner.nextLine();
                editInput(text);
                break;
        }
    }
    public static int editInput(int number){
        return number*2;
    }

    public static double editInput(double number){
        return number*1.5;
    }
    public static void editInput(String text){
        System.out.print("$"+text+"$");
    }
}
