import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OpinionPoll {
    static class Person{
        String name;
        int age;

        Person(String name, int age){
            this.name=name;
            this.age=age;
        }
        Integer getAge(){
            return this.age;
        }
        @Override
        public String toString(){
          return  String.format("%s - %d",this.name,this.age);
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int lineNumbers=Integer.parseInt(scanner.nextLine());
        List<Person> personList= new ArrayList<Person>();

        for (int i = 0; i < lineNumbers; i++) {
            String input=scanner.nextLine();
            String[] data = input.split(" ");

            Person person=new Person(data[0],Integer.parseInt(data[1]));
            personList.add(person);
        }

        personList.stream()
                .filter(person -> person.getAge()>30)
                .forEach(person -> System.out.println(person.toString()));
    }
}
