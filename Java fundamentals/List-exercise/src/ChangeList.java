import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<Integer> numbers= Arrays.stream(scanner.nextLine().split(" ")).map(Integer :: parseInt).collect(Collectors.toList());
        String input=scanner.nextLine();

        while(!input.equals("end")){
            String command=input.split(" ")[0];
            int element=Integer.parseInt(input.split(" ")[1]);
            if(command.equals("Delete")){
                deleteAllElements(element,numbers);
            }else if(command.equals("Insert")){
                int position=Integer.parseInt(input.split(" ")[2]);
                insertElement(numbers,element,position);
            }
            input= scanner.nextLine();
        }
        printList(numbers);
    }
    public static void deleteAllElements(int elements,List<Integer>numbers){
        for (int i = numbers.size()-1; i >=0 ; i--) {
            if(numbers.get(i)==elements){
                numbers.remove(i);
            }
        }
    }

    public static void insertElement(List<Integer>numbers,int element,int position){
        numbers.add(position,element);
    }

    public static void printList(List<Integer>numbers){
        for(int number:numbers){
            System.out.print(number+" ");
        }
    }
}
