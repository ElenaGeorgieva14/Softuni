import java.util.ArrayDeque;
import java.util.Scanner;

public class SimpleTextEditor {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int numberOfOperations=Integer.parseInt(scanner.nextLine());

        StringBuilder text=new StringBuilder();
        ArrayDeque<String> stack=new ArrayDeque<>();
        int lastCommand=0;

        for (int i = 0; i < numberOfOperations; i++) {
            String[] input=scanner.nextLine().split(" ");
            String command=input[0];

            switch(command){
                case "1":
                    lastCommand=1;
                    String newText=input[1];
                    text.append(newText);
                    stack.push(text.toString());
                    break;
                case "2":
                    lastCommand=2;
                    int elementToErase=Integer.parseInt(input[1]);
                    text.delete(text.length()-elementToErase,text.length());
                    stack.push(text.toString());
                    break;
                case "3":
                    lastCommand=3;
                    int position=Integer.parseInt(input[1]);
                    System.out.println(text.charAt(position-1));
                    break;
                case "4":
                    if(!stack.isEmpty()) {
                        if (lastCommand != 4) {
                            stack.pop();
                        }
                        text.delete(0, text.length());
                        text.append(stack.pop());
                        lastCommand = 4;
                    }
                    break;
            }
        }
    }
}
