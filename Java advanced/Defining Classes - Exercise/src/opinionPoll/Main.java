package opinionPoll;

import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int peoplesNum=Integer.parseInt(scanner.nextLine());

        List<Person> personList=new ArrayList<>();

        for (int i = 0; i < peoplesNum; i++) {
            String[] data=scanner.nextLine().split(" ");
            String name=data[0];
            int age=Integer.parseInt(data[1]);

            if(age>30){
                Person person=new Person(name,age);
                personList.add(person);
            }

        }

        personList.stream().sorted(Comparator.comparing(Person :: getName))
                .forEach(x-> System.out.printf("%s - %d%n",x.getName(),x.getAge()));
    }
}
