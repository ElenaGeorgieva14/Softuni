import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Inventory {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<String> inventory= Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        String input=scanner.nextLine();

        while(!input.equals("Craft!")){
            String [] commands=input.split(" - ");
            String operator=commands[0];
            String item=commands[1];
            switch (operator){
                case "Collect":
                    addItem(item,inventory);
                    break;
                case "Drop":
                    dropItem(item,inventory);
                    break;
                case "Combine Items":
                    String oldItem=item.split(":")[0];
                    String newItem=item.split(":")[1];
                    combineItems(oldItem,newItem,inventory);
                    break;
                case "Renew":

                    renewItem(item,inventory);
                    break;
            }
            input=scanner.nextLine();
        }
       printList(inventory);
    }
    public static void addItem(String item,List<String>inventory){
        if(!inventory.contains(item)){
            inventory.add(item);
        }
    }

    public static void dropItem(String item,List<String> inventory){
        if(inventory.contains(item)){
            inventory.remove(item);
        }
    }

    public static void combineItems(String oldItem,String newItem,List<String>inventory){
        if(inventory.contains(oldItem)){
            int index=inventory.indexOf(oldItem);
            inventory.add(index+1,newItem);
        }
    }

    public static void renewItem(String item,List<String>inventory){
        if(inventory.contains(item)){
            int index=inventory.indexOf(item);
            inventory.add(item);
            inventory.remove(index);
        }
    }
    public static void printList(List<String>inventory){
        for (int i = 0; i < inventory.size()-1; i++) {
            System.out.print(inventory.get(i)+", ");
        }
        System.out.print(inventory.get(inventory.size()-1));
    }
}
