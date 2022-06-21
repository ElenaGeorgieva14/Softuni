import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Race {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] names=scanner.nextLine().split(", ");
        String input=scanner.nextLine();
        Map<String,Integer> racers=new LinkedHashMap<>();

        Pattern namePattern=Pattern.compile("(?<letters>[A-Z]|[a-z]+)");
        Pattern pointsPattern=Pattern.compile("\\d");

        while(!input.equals("end of race")) {
            Matcher nameMatcher = namePattern.matcher(input);
            Matcher pointsMatcher = pointsPattern.matcher(input);
            String name = "";
            int points = 0;

            while (nameMatcher.find()) {
                name += nameMatcher.group("letters");
            }

            if (contains(names, name)) {
                while (pointsMatcher.find()) {
                    points += Integer.parseInt(pointsMatcher.group());
                }
                racers.putIfAbsent(name, 0);
                racers.put(name, racers.get(name) + points);

            }
            input= scanner.nextLine();
        }
        String first=betterRacer(racers);
        System.out.printf("1st place: %s%n",first);
        racers.remove(first);

        String second=betterRacer(racers);
        System.out.printf("2nd place: %s%n",second);
        racers.remove(second);

        String third=betterRacer(racers);
        System.out.printf("3rd place: %s%n",third);
        racers.remove(third);

    }

    private static boolean contains(String[]names, String name){
        boolean isInTheList=false;
        for (int i = 0; i < names.length; i++) {
            if(names[i].equals(name)){
                isInTheList=true;
                break;
            }
        }
        return  isInTheList;
    }

    private static String betterRacer(Map<String,Integer>racers){
        int firstPoints=0;
        String first="";

        for (Map.Entry<String,Integer>entry: racers.entrySet()) {
            String key=entry.getKey();

            if(racers.get(key)>firstPoints){
                firstPoints=racers.get(key);
                first=key;
            }
        }
        return first;
    }
}
