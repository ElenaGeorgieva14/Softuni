import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] numbers= scanner.nextLine().split(" ");
        int rotations=Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < rotations; i++) {
            String firstElement=numbers[0];
            for (int j = 1; j < numbers.length; j++) {
                numbers[j-1]=numbers[j];
            }
            numbers[numbers.length-1]=firstElement;
        }
        for(String number:numbers){
            System.out.print(number+" ");
        }
    }
}
