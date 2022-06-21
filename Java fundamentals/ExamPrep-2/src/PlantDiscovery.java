import java.util.*;

public class PlantDiscovery {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int lines=Integer.parseInt(scanner.nextLine());

        Map<String,Integer> plantRarity=new LinkedHashMap<>();

        for (int i = 0; i < lines; i++) {
            String input=scanner.nextLine();
            String name=input.split("<->")[0];
            int rarity=Integer.parseInt(input.split("<->")[1]);
            plantRarity.put(name,rarity);
        }

        String input=scanner.nextLine();
        Map<String, List<Integer>>plantRating=new LinkedHashMap<>();

        while(!input.equals("Exhibition")){
            String command=input.split(": ")[0];
            String anotherData=input.split(": ")[1];
            String[] data=anotherData.split(" - ");
            String plant=data[0];
            switch(command){
                case "Rate":
                    int rating=Integer.parseInt(data[1]);
                    if(containsName(plantRarity,plant)){
                    addRating(plantRating, plant, rating);
                }
                    break;
                case "Update":
                    int rarity=Integer.parseInt(data[1]);
                    if(containsName(plantRarity,plant)) {
                        updateRarity(plantRarity, rarity, plant);
                    }
                    break;
                case "Reset":
                    if(containsName(plantRarity,plant)) {
                        reset(plantRating, plant);
                    }
                    break;
            }

            input=scanner.nextLine();
        }
        System.out.println("Plants for the exhibition:");
        for(Map.Entry<String,Integer>entry:plantRarity.entrySet()){
            String name=entry.getKey();
            int rarity=entry.getValue();
            double avrRate=0.00;

            if(plantRating.get(name).size()>0) {
                for (int i = 0; i < plantRating.get(name).size(); i++) {
                    avrRate += plantRating.get(name).get(i);
                }
                avrRate /= plantRating.get(name).size();
            }
            System.out.printf("- %s; Rarity: %d; Rating: %.2f%n",name,rarity,avrRate);
        }
    }

    private static boolean containsName(Map<String,Integer>map,String name){
        boolean isThere=false;

        if (map.containsKey(name)) {
            isThere=true;
        }
        return isThere;
    }
    private static void addRating(Map<String,List<Integer>>map,String name,int rating){
        map.putIfAbsent(name,new ArrayList<>());
        map.get(name).add(rating);

    }

    private static void updateRarity(Map<String,Integer>map,int rarity,String name){
        map.put(name,rarity);
    }

    private static void reset(Map<String,List<Integer>>map,String name){
        map.get(name).removeAll(map.get(name));
    }
}
