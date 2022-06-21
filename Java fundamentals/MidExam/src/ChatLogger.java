import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChatLogger {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<String> messages=new ArrayList<String>();
        String input= scanner.nextLine();

        while (!input.equals("end")){
            String command=input.split(" ")[0];

            switch(command){
                case "Chat":
                    String message=input.split(" ")[1];
                    messages.add(message);
                    break;
                case "Delete":
                    message=input.split(" ")[1];
                    if(isValid(messages,message)){
                        deleteMessage(messages,message);
                    }
                    break;
                case "Edit":
                    message=input.split(" ")[1];
                    if(isValid(messages,message)){
                        String editedVersion=input.split(" ")[2];
                        editMessage(messages,message,editedVersion);
                    }
                    break;
                case "Pin":
                    message=input.split(" ")[1];
                    if(isValid(messages,message)){
                        pinMessage(messages,message);
                    }
                    break;
                case "Spam":
                    List<String>spams= Arrays.stream(input.split(" ")).collect(Collectors.toList());
                    spams.remove("Spam");
                    addSpam(messages,spams);
                    break;
            }

            input=scanner.nextLine();
        }
        for(String message:messages){
            System.out.println(message);
        }
    }
    public static boolean isValid(List<String>messages,String message){
      return messages.contains(message);
    }
    public static void deleteMessage(List<String>messages,String message){
        messages.remove(message);
    }

    public static void editMessage(List<String>messages,String message,String newMessage){
        int index=messages.indexOf(message);
        messages.set(index,newMessage);
    }

    public static void pinMessage(List<String>messages,String message){
        int index=messages.indexOf(message);
        messages.add(message);
        messages.remove(index);
    }
    public static void addSpam(List<String>messages,List<String> spams){
        for (int i = 0; i < spams.size(); i++) {
            messages.add(spams.get(i));
        }
    }
}
