import java.util.*;

public class HandsOfCards {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();

        Map<String, Set<String>> players=new LinkedHashMap<>();

        while(!input.equals("JOKER")){
            String name=input.split(": ")[0];
            String [] cards=input.split(": ")[1].split(", ");

            players.putIfAbsent(name,new LinkedHashSet<>());
            for (int i = 0; i < cards.length; i++) {
                players.get(name).add(cards[i]);
            }

            input=scanner.nextLine();
        }

        Set<Map.Entry<String ,Set<String>>> entries=players.entrySet();

        for(var entry: entries){
            Set<String> cards=entry.getValue();
            int value=0;

            for(String card : cards){
                char type=card.charAt(card.length()-1);
                String power=card.substring(0,card.length()-1);

                int powerNum=findPower(power);
                int typeNum=findType(type);
                value+=powerNum*typeNum;
            }

            System.out.printf("%s: %d%n",entry.getKey(),value);
        }
    }

    private static int findType(char type) {
        switch (type){
            case 'S':
                return 4;
            case 'H':
                return 3;
            case 'D':
                return 2;
            case 'C':
                return 1;
            default:
                return 0;
        }
    }

    private static int findPower(String power) {

        switch (power){
            case "J":
                return 11;
            case "Q":
                return 12;
            case "K":
                return 13;
            case "A":
                return 14;
            default:
                return Integer.parseInt(power+"");
        }
    }
}
