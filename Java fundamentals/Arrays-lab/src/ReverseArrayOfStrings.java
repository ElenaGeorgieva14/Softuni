import java.util.Scanner;

public class ReverseArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] inputs =scanner.nextLine().split(" ");

        for (int i = 0; i < inputs.length/2; i++) {
                String temp= inputs[i];
                 inputs[i] = inputs[inputs.length-i-1];
                inputs[inputs.length-i-1]=temp;
        }
        for(String input:inputs){
            System.out.print(input+" ");
        }
    }
}
