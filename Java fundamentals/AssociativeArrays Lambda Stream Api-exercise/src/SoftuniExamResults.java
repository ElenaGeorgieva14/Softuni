import java.util.*;

public class SoftuniExamResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> userSubmissions = new LinkedHashMap<>();
        Map<String, Integer> userPoints = new LinkedHashMap<>();
        String input = scanner.nextLine();
        while (!input.equals("exam finished")) {
            String[] data = input.split("-");

            if (data.length == 3) {
                String username = data[0];
                String language = data[1];
                int points = Integer.parseInt(data[2]);

                userSubmissions.putIfAbsent(username, new ArrayList<>());
                userSubmissions.get(username).add(language);

                userPoints.putIfAbsent(username, 0);
                if (points > userPoints.get(username)) {
                    userPoints.put(username, userPoints.get(username) + points);
                }

            } else if (data.length == 2) {
                String username = data[0];
                userPoints.remove(username);
            }

            input = scanner.nextLine();
        }
        System.out.println("Results:");
        userPoints.forEach((key, value) -> System.out.printf("%s | %d%n", key, value));

        System.out.println("Submissions:");

        Map<String,Integer> submissionsCount=new LinkedHashMap<>();

        for(Map.Entry<String,List<String>> entry : userSubmissions.entrySet()){
            for (int i = 0; i < entry.getValue().size(); i++) {
                String key=entry.getValue().get(i);
                submissionsCount.putIfAbsent(key, 0);
                submissionsCount.put(key,submissionsCount.get(key)+1);
            }
        }

        submissionsCount.forEach((key,value) -> System.out.printf("%s - %d%n",key,value));
    }
}
