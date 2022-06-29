import java.util.*;

public class FixEmails {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();

        Map<String,String> personEmail=new LinkedHashMap<>();

        while(!input.equals("stop")){
            String email= scanner.nextLine();
            String emailSmallCase=email.toLowerCase();
            if(!emailSmallCase.contains(".us") && !emailSmallCase.contains(".uk")&& !emailSmallCase.contains(".com")){
                personEmail.put(input,email);
            }
            input=scanner.nextLine();
        }

        Set<Map.Entry<String,String>> entries=personEmail.entrySet();

        for(var entry:entries){
            System.out.printf("%s -> %s%n",entry.getKey(),entry.getValue());
        }
    }
}
