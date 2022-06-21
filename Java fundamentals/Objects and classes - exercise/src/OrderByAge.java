import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrderByAge {
    static class Person{
        String name;
        String id;
        int age;

        Person(String name,String id, int age){
            this.name=name;
            this.id=id;
            this.age=age;
        }

        String getName(){
            return this.name;
        }

        void setName(String name){
            this.name=name;
        }

        String getId(){
            return this.id;
        }
        void setAge(String id){
            this.id=id;
        }

        int getAge(){
            return this.age;
        }

        void setAge(int age){
            this.age=age;
        }

        @Override
        public String toString(){
            return String.format("%s with ID: %s is %d years old."
            ,this.getName(),this.getId(),this.getAge());
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input= scanner.nextLine();
        List<Person> personList=new ArrayList<>();

        while(!input.equals("End")){
            String[] data=input.split(" ");
            Person person=new Person(data[0],data[1],Integer.parseInt(data[2]));
            personList.add(person);

            input= scanner.nextLine();
        }

        personList.stream()
                .sorted((p1,p2) -> Integer.compare(p1.getAge(), p2.getAge()))
                .forEach(person -> System.out.println(person.toString()));

    }
}
