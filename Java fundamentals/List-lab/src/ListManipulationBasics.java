import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<Integer> numbers= Arrays.stream(scanner.nextLine().split(" ")).map(Integer :: parseInt).collect(Collectors.toList());
        String input=scanner.nextLine();

        while(!input.equals("end")){
            String command=input.split(" ")[0];
            int number=Integer.parseInt(input.split(" ")[1]);
            switch(command){
                case "Add":
                    addElement(number,numbers);
                    break;
                case "Remove":
                    removeElement(number,numbers);
                    break;
                case "RemoveAt":
                    boolean isValid=indexIsValid(number,numbers);
                    if(isValid){
                        removeElementAtIndex(number,numbers);
                    }
                    break;
                case "Insert":
                    int index=Integer.parseInt(input.split(" ")[2]);
                    boolean isValidIndex=indexIsValid(index,numbers);
                    if(isValidIndex){
                        insertAtIndex(index,number,numbers);
                    }
                    break;
            }
            input= scanner.nextLine();
        }
        printList(numbers);
    }
    public static boolean indexIsValid(int number,List<Integer>numbers){
        boolean isValid=false;
        if(number<=numbers.size()){
            isValid=true;
        }
        return  isValid;
    }
    public static void addElement(int number,List<Integer>numbers){
        numbers.add(number);
    }

    public static void removeElement(int number,List<Integer>numbers){
        Integer currentNum= number;
        numbers.remove(currentNum);
    }

    public static void removeElementAtIndex(int index, List<Integer> numbers){
        numbers.remove(index);
    }

    public static void insertAtIndex(int index,int number,List<Integer> numbers){
        numbers.add(index,number);
    }

    public static void printList(List<Integer>numbers){
      for(int number : numbers){
          System.out.print(number+" ");
      }
    }
}
