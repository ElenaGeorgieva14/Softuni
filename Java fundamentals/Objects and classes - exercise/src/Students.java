import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students {

    static class Student{
        String firstName;
        String lastName;
        double grade;

        Student(String firstName,String lastName,double grade){
            this.firstName=firstName;
            this.lastName=lastName;
            this.grade=grade;
        }

        String getFirstName(){
            return this.firstName;
        }
        void setFirstName(String firstname){
            this.firstName=firstname;
        }

        String getLastName(){
            return this.lastName;
        }
        void setLastName(String lastName){
            this.lastName=lastName;
        }

        double getGrade(){
            return this.grade;
        }
        void setGrade(double grade){
            this.grade=grade;
        }

        @Override
        public String toString(){
            return String.format("%s %s: %.2f"
                    ,this.getFirstName(),this.getLastName(),this.getGrade());
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int studentsCount=Integer.parseInt(scanner.nextLine());
        List<Student> studentList=new ArrayList<>();

        for (int i = 0; i < studentsCount; i++) {
            String input=scanner.nextLine();
            String[] data= input.split(" ");

            Student student=new Student(data[0],data[1],Double.parseDouble(data[2]));
            studentList.add(student);
        }

        studentList.stream()
                .sorted((s1,s2) -> Double.compare(s2.getGrade(),s1.getGrade()))
                .forEach(student -> System.out.println(student.toString()));
    }
}
