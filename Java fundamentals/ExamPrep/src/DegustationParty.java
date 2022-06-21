import java.util.*;

public class DegustationParty {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Map<String, List<String>> guestMeals=new LinkedHashMap<>();
        String input=scanner.nextLine();
        int counter=0;
        while(!input.equals("Stop")){
            String[] data=input.split("-");
            String command=data[0];
            String guest=data[1];
            String meal=data[2];

            switch (command){
                case "Like":
                    like(guestMeals,meal,guest);
                    break;

                case "Dislike":
                  counter+=dislike(guestMeals,guest,meal);
                    break;
            }
            input=scanner.nextLine();
        }

        printMap(guestMeals);
        System.out.printf("Unliked meals: %d",counter);
    }

    private static void printMap(Map<String, List<String>> guestMeals) {
            for(Map.Entry<String,List<String>>entry:guestMeals.entrySet()){
                String meals=String.join(", ",guestMeals.get(entry.getKey()));
                System.out.printf("%s: %s%n",entry.getKey(),meals);
            }
    }

    private static int dislike(Map<String, List<String>> guestMeals, String guest, String meal) {
       boolean hasMeal=false;
       boolean isGuest=false;
       int counter=0;
        for (int i = 0; i < guestMeals.size(); i++) {
            if(guestMeals.containsKey(guest)){
                isGuest=true;
                break;
            }
        }

        if(isGuest) {
            for (int i = guestMeals.get(guest).size() - 1; i >= 0; i--) {
                if (guestMeals.get(guest).get(i).equals(meal)) {
                    guestMeals.get(guest).remove(i);
                    hasMeal = true;
                    counter++;
                    System.out.printf("%s doesn't like the %s.%n", guest, meal);
                    break;
                }
            }
            if(!hasMeal){
                System.out.printf("%s doesn't have the %s in his/her collection.%n",guest,meal);
            }
        }else{
            System.out.printf("%s is not at the party.%n",guest);
        }


        return counter;
    }

    private static void like(Map<String, List<String>> guestMeals, String meal,String guest) {
        boolean isContainig=false;

        guestMeals.putIfAbsent(guest,new ArrayList<>());
        for (int i = 0; i < guestMeals.get(guest).size(); i++) {
            if(guestMeals.get(guest).get(i).equals(meal)){
                isContainig=true;
                break;
            }
        }
        if(!isContainig){
        guestMeals.get(guest).add(meal);
        }
    }
}
