import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int lines=Integer.parseInt(scanner.nextLine());
        List<String> guests=new ArrayList<>();

        while(lines>0){
            String input=scanner.nextLine();
            String name=input.split(" ")[0];

            if(input.contains("is going")){
                addGuest(guests,name);
            }else if(input.contains("is not going")){
                removeGuest(guests,name);
            }

            lines--;
        }
        guests.forEach(guest -> System.out.println(guest));
    }
    public static void addGuest(List<String>peoples, String name){
        if(peoples.contains(name)){
            System.out.printf("%s is already in the list!%n",name);
        }else{
            peoples.add(name);
        }
    }

    public static void removeGuest(List<String>peoples,String name){
        if(peoples.contains(name)){
            peoples.remove(name);
        }else{
            System.out.printf("%s is not in the list!%n",name);
        }
    }
}
