import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MuOnline {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int health=100;
        int bitcoins=0;
        String input=scanner.nextLine();
        boolean isDeath=false;

        List<String> rooms= Arrays.stream(input.split("\\|")).collect(Collectors.toList());
        int currentPosition=0;

       while(currentPosition<rooms.size() && isDeath==false) {
            String command=rooms.get(currentPosition).split(" ")[0];
            int number=Integer.parseInt(rooms.get(currentPosition).split(" ")[1]);

            switch (command){
                case "potion":
                    health=heal(number,health);
                    break;
                case "chest":
                    bitcoins+=number;
                    System.out.printf("You found %d bitcoins.%n",number);
                    break;
                default:
                    health-=number;
                    if(health>0){
                        System.out.printf("You slayed %s.%n",command);
                    }else{
                        System.out.printf("You died! Killed by %s.%n",command);
                        System.out.printf("Best room: %d%n",currentPosition+1);
                        isDeath=true;
                    }
                    break;
            }
            currentPosition++;
        }

       if(!isDeath){
           System.out.println("You've made it!");
           System.out.printf("Bitcoins: %d%n",bitcoins);
           System.out.printf("Health: %d%n",health);
       }

    }

    public static int heal(int number,int currentHealth){
        if(currentHealth<100) {
            if(currentHealth+number<=100){
                currentHealth+=number;
            }else{
                number=100;
                number-=currentHealth;
                currentHealth+=number;
            }
            System.out.printf("You healed for %d hp.%n",number);
            System.out.printf("Current health: %d hp.%n",currentHealth);
        }
        return currentHealth;
    }
}
