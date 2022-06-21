import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number=Integer.parseInt(scanner.nextLine());
        double volume=0.0;
        double maxVolume=0.0;
        String maxModel="";
        for (int i = 0; i <number ; i++) {
            String model=scanner.nextLine();
            double radius=Double.parseDouble(scanner.nextLine());
            int height=Integer.parseInt(scanner.nextLine());
            volume=Math.PI*radius*radius*height;

            if(volume>maxVolume){
                maxVolume=volume;
                maxModel=model;
            }
        }
        System.out.println(maxModel);
    }
}
