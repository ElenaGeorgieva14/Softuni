import java.util.*;

public class ForceBook {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        Map<String, List<String>> sideMembers=new LinkedHashMap<>();

        while(!input.equals("Lumpawaroo")){

            if(input.contains("|")){
               String side=input.split("\\s+\\|\\s+")[0];
                String user=input.split("\\s+\\|\\s+")[1];

                sideMembers.putIfAbsent(side,new ArrayList<>());
                boolean noneMatch=sideMembers.entrySet().stream()
                        .noneMatch(entry -> entry.getValue().contains(user));

                if(noneMatch){
                    sideMembers.get(side).add(user);
                }

        }else if(input.contains("->")){
                String user=input.split(" -> ")[0];
                String side=input.split(" -> ")[1];
                boolean noneMatch=sideMembers.entrySet().stream()
                        .noneMatch(entry -> entry.getValue().contains(user));

                sideMembers.putIfAbsent(side,new ArrayList<>());
                if(!noneMatch){
                    sideMembers.forEach((k, v) -> v.remove(user));
                }
                    sideMembers.get(side).add(user);
                System.out.printf("%s joins the %s side!%n",user,side);
            }
            input=scanner.nextLine();
        }
            for(Map.Entry<String,List<String>> entry: sideMembers.entrySet()){
                if(entry.getValue().size()>0) {
                    System.out.printf("Side: %s, Members: %d%n",entry.getKey(),entry.getValue().size());
                    for (int i = 0; i < entry.getValue().size(); i++) {
                        System.out.printf("! %s%n", entry.getValue().get(i));
                    }
                }
            }

    }
}
