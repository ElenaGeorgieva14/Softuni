import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Judge {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();

        Map<String, List<String>> userContests=new LinkedHashMap<>();
        Map <String, Integer> userPoint=new LinkedHashMap<>();

        String[] data =input.split(" -> ");
        String username=data[0];
        String contest=data[1];
        int points=Integer.parseInt(data[2]);

        userContests.putIfAbsent(c)
    }
}
