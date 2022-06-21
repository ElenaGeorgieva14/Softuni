import java.util.*;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Map<String, List<String>> companyEmployees=new LinkedHashMap<>();

        String input=scanner.nextLine();

        while(!input.equals("End")){
            String company=input.split(" -> ")[0];
            String employee=input.split(" -> ")[1];

            companyEmployees.putIfAbsent(company,new ArrayList<>());
            if(!companyEmployees.get(company).contains(employee)){
                companyEmployees.get(company).add(employee);
            }
            input=scanner.nextLine();
        }

        for(Map.Entry<String,List<String>> entry :companyEmployees.entrySet()){
            System.out.printf("%s%n",entry.getKey());
            for (int i = 0; i < entry.getValue().size(); i++) {
                System.out.printf("-- %s%n",entry.getValue().get(i));
            }
        }

    }
}
