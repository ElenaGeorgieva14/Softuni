package companyRoster;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        
        int lines=Integer.parseInt(scanner.nextLine());

        Map<String, List<Employee>> departmentEmployees=new LinkedHashMap<>();


        for (int i = 0; i < lines; i++) {
            String[] data=scanner.nextLine().split(" ");
            String name=data[0];
            double salary=Double.parseDouble(data[1]);
            String position=data[2];
            String department=data[3];

            departmentEmployees.putIfAbsent(department,new ArrayList<>());

            if(data.length==4){
                Employee employee=new Employee(name,salary,position,department);
                departmentEmployees.get(department).add(employee);
            }else if(data.length==5){

                if(data[4].matches("\\d+")){
                    int age=Integer.parseInt(data[4]);
                    Employee employee=new Employee(name,salary,position,department,age);
                    departmentEmployees.get(department).add(employee);
                }else{
                    String email=data[4];
                    Employee employee=new Employee(name,salary,position,department,email);
                    departmentEmployees.get(department).add(employee);
                }
            }else if(data.length==6){
                String email=data[4];
                int age=Integer.parseInt(data[5]);

                Employee employee=new Employee(name,salary,position,department,email,age);
                departmentEmployees.get(department).add(employee);
            }
        }

        Set<Map.Entry<String, List<Employee>>> entries=departmentEmployees.entrySet();
        String bestDepartment="";
        double maxAverageSalaries=Double.MIN_VALUE;

        for(var entry : entries){
            double totalSalaries=0.0;

            for (int i = 0; i <entry.getValue().size(); i++) {
                totalSalaries+=entry.getValue().get(i).getSalary();
            }

            if(totalSalaries/entry.getValue().size()>maxAverageSalaries){
                bestDepartment=entry.getKey();
                maxAverageSalaries=totalSalaries/entry.getValue().size();
            }
        }

        System.out.printf("Highest Average Salary: %s%n",bestDepartment);

        List<Employee> bestEmployees=departmentEmployees.get(bestDepartment);

        bestEmployees.sort((n1,n2)->Double.compare(n2.getSalary(),n1.getSalary()));
        for (int i = 0; i < bestEmployees.size(); i++) {
            System.out.printf("%s %.2f %s %d%n",
                    bestEmployees.get(i).getName(), bestEmployees.get(i).getSalary(),
                    bestEmployees.get(i).getEmail(),bestEmployees.get(i).getAge());
        }
    }
}
