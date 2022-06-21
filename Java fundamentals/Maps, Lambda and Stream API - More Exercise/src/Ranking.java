import java.util.*;

public class Ranking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, String> contestPassword = new LinkedHashMap<>();
        while (!input.equals("end of contests")) {
            String contest = input.split(":")[0];
            String password = input.split(":")[1];

            contestPassword.put(contest, password);
            input = scanner.nextLine();
        }
        input = scanner.nextLine();

        Map<String, List<String>> userContests = new TreeMap<>();
        Map<String, List<Integer>> userPoints = new LinkedHashMap<>();

        while (!input.equals("end of submissions")) {
            String[] data = input.split("=>");
            String contest = data[0];
            String password = data[1];
            String username = data[2];
            int point = Integer.parseInt(data[3]);

            if (isContestValid(contestPassword, contest) && isPasswordValid(contestPassword, contest, password)) {

                userPoints.putIfAbsent(username, new ArrayList<>());
                if (userContests.containsKey(username) && userIsParticipateAlready(userContests.get(username), contest)) {
                    int oldPointsIndex = userContests.get(username).indexOf(contest);
                    int oldPoints = userPoints.get(username).get(oldPointsIndex);


                    if (point > oldPoints) {
                        userPoints.get(username).set(oldPointsIndex, point);
                    } else {
                        input = scanner.nextLine();
                        continue;
                    }
                } else {
                    userContests.putIfAbsent(username, new ArrayList<>());
                    userContests.get(username).add(contest);
                    userPoints.get(username).add(point);
                }
            }

            input = scanner.nextLine();
        }

        userWithMostPoints(userPoints);
        System.out.println("Ranking:");
        finalPrint(userContests,userPoints);
    }

    public static boolean isContestValid(Map<String, String> map, String contest) {
        boolean isValid = false;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getKey().equals(contest)) {
                isValid = true;
            }
        }
        return isValid;
    }

    public static boolean isPasswordValid(Map<String, String> map, String contest, String password) {
        boolean isValid = false;
        if (map.get(contest).equals(password)) {
            isValid = true;
        }
        return isValid;
    }

    public static boolean userIsParticipateAlready(List<String> list, String contest) {
        boolean isParticipate = false;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(contest)) {
                isParticipate = true;
                break;
            }
        }
        return isParticipate;
    }

    public static void userWithMostPoints(Map<String, List<Integer>> userPoints) {
        Map<String, Integer> usersSumPoint = new LinkedHashMap<>();

        for (Map.Entry<String, List<Integer>> entry : userPoints.entrySet()) {
            int sum = 0;

            for (int i = 0; i < entry.getValue().size(); i++) {
                sum += entry.getValue().get(i);
            }

            usersSumPoint.put(entry.getKey(), sum);
        }

        String theBestUser = "";
        int theBestPoints = 0;

        for (Map.Entry<String, Integer> entry : usersSumPoint.entrySet()) {
            if (entry.getValue() > theBestPoints) {
                theBestUser = entry.getKey();
                theBestPoints = entry.getValue();
            }
        }
        System.out.printf("Best candidate is %s with total %d points.%n", theBestUser, theBestPoints);

    }
    public static void finalPrint(Map<String,List<String>> usersContests,Map<String,List<Integer>>userPoints){
        for (Map.Entry<String,List<String>>entry : usersContests.entrySet()){
            System.out.printf("%s%n",entry.getKey());

            for (int i = 0; i <entry.getValue().size() ; i++) {
                System.out.printf("#  %s -> %d%n",entry.getValue().get(i),userPoints.get(entry.getKey()).get(i));
            }
        }
    }

}
