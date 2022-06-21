import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftuniParking {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int numberOfLines=Integer.parseInt(scanner.nextLine());
        Map<String,String> userCar= new LinkedHashMap<>();

        for (int i = 0; i < numberOfLines; i++) {
            String input=scanner.nextLine();
            String command=input.split(" ")[0];
            String username=input.split(" ")[1];
            switch (command){
                case "register":
                    String licensePlateNum=input.split(" ")[2];

                    if(userCar.containsKey(username)){
                        System.out.printf("ERROR: already registered with plate number %s%n",userCar.get(username));
                        continue;
                    }else{
                        userCar.put(username,licensePlateNum);
                        System.out.printf("%s registered %s successfully%n",username,licensePlateNum);
                    }
                    break;
                case "unregister":
                    if(!userCar.containsKey(username)){
                        System.out.printf("ERROR: user %s not found%n",username);
                    }else{
                        userCar.remove(username);
                        System.out.printf("%s unregistered successfully%n",username);
                    }
                    break;
            }
        }

        userCar.forEach((key,value) -> System.out.printf("%s => %s%n",key,value));
    }
}
