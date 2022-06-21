import java.util.*;

public class StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Map<String, List<Double>> studentGrade=new LinkedHashMap<>();

        int rows=Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < rows; i++) {
            String name=scanner.nextLine();
            double grade=Double.parseDouble(scanner.nextLine());

            studentGrade.putIfAbsent(name,new ArrayList<>());
            studentGrade.get(name).add(grade);
        }
         studentGrade.forEach((key,value) -> {
             double averageGrade=value.stream().mapToDouble(x -> x).average().orElse(0.0);
             if(averageGrade>=4.50){
                 System.out.printf("%s -> %.2f%n",key,averageGrade);
             }
         });


    }
}
