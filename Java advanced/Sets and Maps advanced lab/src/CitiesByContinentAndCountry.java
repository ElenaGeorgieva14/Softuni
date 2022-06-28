import java.util.*;

public class CitiesByContinentAndCountry {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int inputRows=Integer.parseInt(scanner.nextLine());

        Map<String, Map<String, ArrayList<String>>> continentsMap=new LinkedHashMap<>();
        for (int i = 0; i < inputRows; i++) {
            String[] data=scanner.nextLine().split(" ");
            String continent=data[0];
            String country=data[1];
            String city=data[2];

            continentsMap.putIfAbsent(continent,new LinkedHashMap<>());
            continentsMap.get(continent).putIfAbsent(country,new ArrayList<>());
            continentsMap.get(continent).get(country).add(city);
        }

        Set<Map.Entry<String,Map<String,ArrayList<String>>>> entries=continentsMap.entrySet();

        for(var entry : entries){
            System.out.printf("%s:%n",entry.getKey());

            Set<Map.Entry<String,ArrayList<String>>> countryEntries=entry.getValue().entrySet();

            for(var countryEntry : countryEntries){
                String cities="";
                for (int i = 0; i < countryEntry.getValue().size(); i++) {
                    if(i<=countryEntry.getValue().size()-2) {
                        cities += countryEntry.getValue().get(i)+", ";
                    }else{
                        cities+=countryEntry.getValue().get(i);
                    }
                }
                System.out.printf("  %s -> %s%n",countryEntry.getKey(),cities);
            }
        }
    }
}
