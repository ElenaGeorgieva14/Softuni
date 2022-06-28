import com.sun.source.tree.Tree;

import java.util.*;

public class AverageStudentsGrades {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int inputRows=Integer.parseInt(scanner.nextLine());

        Map<String, ArrayList<Double>> studentsGrade=new TreeMap<>();

        for (int i = 0; i < inputRows; i++) {
            String[] data=scanner.nextLine().split(" ");
            String name=data[0];
            Double grade=Double.parseDouble(data[1]);

            studentsGrade.putIfAbsent(name,new ArrayList<>());
            studentsGrade.get(name).add(grade);
        }

        Set<Map.Entry<String,ArrayList<Double>>> entries=studentsGrade.entrySet();

        for(var entry : entries){
            String name=entry.getKey();
            double sum=0.0;
            String allGrades="";
            for (int i = 0; i < entry.getValue().size(); i++) {
                sum+=entry.getValue().get(i);
                allGrades+=String.format("%.2f",entry.getValue().get(i))+" ";
            }

            sum/=entry.getValue().size();
            System.out.printf("%s -> %s(avg: %.2f)%n",name,allGrades,sum);
        }
    }
}
