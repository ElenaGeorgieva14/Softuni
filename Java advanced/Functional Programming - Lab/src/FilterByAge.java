import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class FilterByAge {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int lines=Integer.parseInt(scanner.nextLine());

        Map<String,Integer> peoples=new LinkedHashMap<>();

        for (int i = 0; i < lines; i++) {
            String[] data=scanner.nextLine().split(", ");
            peoples.put(data[0],Integer.parseInt(data[1]));
        }

        String condition=scanner.nextLine();
        int age=Integer.parseInt(scanner.nextLine());
        String format=scanner.nextLine();

        Predicate<Integer> predicate=choosePredicate(condition,age);

        Set<Map.Entry<String ,Integer>> entries=peoples.entrySet();

        for(var entry: entries){
            if(predicate.test(entry.getValue())){
                Consumer<String> formatConsumer=chooseFormat(format,entry.getKey(),entry.getValue());
                formatConsumer.accept(format);
            }
        }






    }

    private static Consumer<String> chooseFormat(String format,String name,int age) {

        Consumer<String> chooseFormat=null;
        switch(format){
            case "name":
                chooseFormat= x-> System.out.println(name);
                break;
            case "age":
                chooseFormat= x-> System.out.println(age);
                break;
            case "name age":
                chooseFormat= x -> System.out.println(name+ " - "+age);
                break;
        }

        return chooseFormat;
    }

    private static Predicate<Integer> choosePredicate(String condition, int age) {

        Predicate<Integer> choosedPredicate=null;
        switch (condition){
            case "younger":
                choosedPredicate = x-> x <= age;
                break;
            case "older":
                choosedPredicate = x-> x>= age;
                break;
        }

        return choosedPredicate;
    }
}
