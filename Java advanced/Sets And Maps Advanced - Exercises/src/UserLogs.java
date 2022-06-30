import java.util.*;

public class UserLogs {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();

        Map<String, Map<String,Integer>> users=new TreeMap<>();


        while(!input.equals("end")){
            String[] data=input.split(" ");
            String ip=data[0].split("IP=")[1];
            String user=data[2].split("user=")[1];

            users.putIfAbsent(user,new LinkedHashMap<>());
            users.get(user).putIfAbsent(ip,0);
            users.get(user).put(ip,users.get(user).get(ip)+1);
            input=scanner.nextLine();
        }

        Set<Map.Entry<String,Map<String,Integer>>> entries=users.entrySet();

        for(var entry: entries){
            System.out.printf("%s: %n",entry.getKey());

            Set<Map.Entry<String,Integer>> ipEntries=users.get(entry.getKey()).entrySet();
            int size=users.get(entry.getKey()).size();

            for(var ipEntry : ipEntries){
                if(size>1) {
                    System.out.printf("%s => %d, ", ipEntry.getKey(), ipEntry.getValue());
                }else{
                    System.out.printf("%s => %d.%n", ipEntry.getKey(), ipEntry.getValue());
                }
                size--;
            }
        }
    }
}
