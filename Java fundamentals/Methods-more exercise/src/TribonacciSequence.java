import java.util.Scanner;

public class TribonacciSequence {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number=Integer.parseInt(scanner.nextLine());
        int[] array=new int[number];
        array[0]=1;
        System.out.print(array[0]);
        findindTribonacci(array);
    }
    public static void findindTribonacci(int[] array){
        for (int i = 1; i < array.length; i++) {
            if(i<3){
                for (int j = 0; j <i; j++) {
                    array[i]+=array[j];
                }
            }else {
                for (int j = i; j >= i - 3; j--) {
                        array[i] += array[j];
                    }
                }
                System.out.print(" " + array[i]);
            }
        }
    }

