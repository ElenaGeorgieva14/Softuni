import java.util.*;

public class LogsAggregator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int logLines=Integer.parseInt(scanner.nextLine());

        Map<String, Map<String,Integer>> users=new TreeMap<>();

        for (int i = 0; i < logLines; i++) {
            String[] data=scanner.nextLine().split(" ");
            String ip=data[0];
            String user=data[1];
            int duration=Integer.parseInt(data[2]);

            users.putIfAbsent(user,new TreeMap<>());
            users.get(user).putIfAbsent(ip,0);
            users.get(user).put(ip,users.get(user).get(ip)+duration);

        }

        Set<Map.Entry<String,Map<String,Integer>>> entries=users.entrySet();

        for(var entry:entries){
            int totalDuration=0;
            Set<Map.Entry<String,Integer>> userEntries=entry.getValue().entrySet();

            Set<String> ipSet=new TreeSet<>();
            for(var userEntry: userEntries){
                totalDuration+=userEntry.getValue();
                ipSet.add(userEntry.getKey());
            }
            String ips=String.join(", ",ipSet);
            System.out.printf("%s: %d [%s]%n",entry.getKey(),totalDuration,ips);
        }
    }
}
