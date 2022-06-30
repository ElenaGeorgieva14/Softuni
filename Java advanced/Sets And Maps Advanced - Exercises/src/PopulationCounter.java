import java.util.*;

public class PopulationCounter {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();

        Map<String, Map<String,Integer>> countries=new LinkedHashMap<>();

        while(!input.equals("report")){
            String[] data=input.split("\\|");
            String city=data[0];
            String country=data[1];
            int population=Integer.parseInt(data[2]);

            countries.putIfAbsent(country,new LinkedHashMap<>());
            countries.get(country).putIfAbsent(city,population);

            input=scanner.nextLine();
        }

        Set<Map.Entry<String,Map<String,Integer>>> entries=countries.entrySet();


        for(var entry: entries){
            int totalPopulation=0;
            Set<Map.Entry<String,Integer>> cityEntries=entry.getValue().entrySet();

            for(var cityEntry: cityEntries){
                totalPopulation+=cityEntry.getValue();
            }
            System.out.printf("%s (total population: %d)%n",entry.getKey(),totalPopulation);

            for (var cityEntry:cityEntries){
                System.out.printf("=>%s: %d%n",cityEntry.getKey(),cityEntry.getValue());
            }

        }
    }
}
