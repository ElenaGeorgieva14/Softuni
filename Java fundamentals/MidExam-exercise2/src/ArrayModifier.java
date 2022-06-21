import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] numbers= Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer :: parseInt).toArray();
        String input= scanner.nextLine();

        while(!input.equals("end")){
            String command=input.split(" ")[0];


            switch(command){
                case "swap":
                    int index1=Integer.parseInt(input.split(" ")[1]);
                    int index2=Integer.parseInt(input.split(" ")[2]);
                    swapElements(numbers,index1,index2);
                    break;
                case "multiply":
                     index1=Integer.parseInt(input.split(" ")[1]);
                     index2=Integer.parseInt(input.split(" ")[2]);
                    multiplyElements(numbers,index1,index2);
                    break;
                case "decrease":
                    decrease(numbers);
                    break;
            }
            input= scanner.nextLine();
        }
        printArray(numbers);
    }
    public static void swapElements(int[] numbers,int index1,int index2){

        int temp=numbers[index1];
        numbers[index1]=numbers[index2];
        numbers[index2]=temp;
    }

    public static void multiplyElements(int[] numbers,int index1, int index2){
        numbers[index1]*=numbers[index2];
    }

    public static void decrease(int[] numbers){
        for (int i = 0; i < numbers.length; i++) {
            numbers[i]--;
        }
    }
    public static void printArray(int[] numbers){
        for (int i = 0; i <numbers.length ; i++) {
            if(i==numbers.length-1){
                System.out.print(numbers[i]);
            }else{
                System.out.print(numbers[i]+", ");
            }
        }
    }
}
