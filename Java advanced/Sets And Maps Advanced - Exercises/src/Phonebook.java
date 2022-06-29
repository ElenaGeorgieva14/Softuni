import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Phonebook {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();

        Map<String,String> phoneBook=new TreeMap<>();

        while(!input.equals("search")){
            String name=input.split("-")[0];
            String phone=input.split("-")[1];
            phoneBook.put(name,phone);
            input=scanner.nextLine();
        }

        input=scanner.nextLine();

        while(!input.equals("stop")){
            if(phoneBook.containsKey(input)){
                System.out.printf("%s -> %s%n",input,phoneBook.get(input));
            }else{
                System.out.printf("Contact %s does not exist.%n",input);
            }

            input=scanner.nextLine();
        }
    }
}
