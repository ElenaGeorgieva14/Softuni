import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n =Integer.parseInt(scanner.nextLine());
        int capacity=0;

        for (int i = 0; i < n ; i++) {
            int litters=Integer.parseInt(scanner.nextLine());
            if(capacity+litters<=255){
                capacity+=litters;
            }else{
                System.out.println("Insufficient capacity!");
            }
        }
        System.out.println(capacity);
    }
}
