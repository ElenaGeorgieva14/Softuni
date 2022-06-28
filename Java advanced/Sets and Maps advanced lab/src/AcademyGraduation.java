import java.text.DecimalFormat;
import java.util.*;

public class AcademyGraduation {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int studentsNum=Integer.parseInt(scanner.nextLine());

        Map<String,Double> students=new TreeMap<>();

        for (int i = 0; i < studentsNum; i++) {
            String name=scanner.nextLine();
            double[] grades= Arrays.stream(scanner.nextLine().split(" ")).mapToDouble(Double :: parseDouble).toArray();

            double avrScore=0.0;
            for (int j = 0; j < grades.length; j++) {
                avrScore+=grades[j];
            }
            avrScore/=grades.length;

            students.putIfAbsent(name,avrScore);
        }

        Set<Map.Entry<String,Double>> entries=students.entrySet();
        DecimalFormat format=new DecimalFormat("###.################");
        for(var entry : entries){
            System.out.printf("%s is graduated with %s%n",entry.getKey(),format.format(entry.getValue()));
        }
    }
}
