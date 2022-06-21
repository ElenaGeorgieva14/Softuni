import java.util.*;

public class Courses {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Map<String, ArrayList<String>> courseStudents=new LinkedHashMap<>();

        String input=scanner.nextLine();

        while(!input.equals("end")){
            String course=input.split(" : ")[0];
            String student=input.split(" : ")[1];

            courseStudents.putIfAbsent(course,new ArrayList<>());
            courseStudents.get(course).add(student);

            input=scanner.nextLine();
        }

        for(Map.Entry<String,ArrayList<String>> entry : courseStudents.entrySet()){
            System.out.printf("%s: %d%n",entry.getKey(),entry.getValue().size());

            for (int i = 0; i < entry.getValue().size(); i++) {
                System.out.printf("-- %s%n",entry.getValue().get(i));
            }
        }
    }
}
