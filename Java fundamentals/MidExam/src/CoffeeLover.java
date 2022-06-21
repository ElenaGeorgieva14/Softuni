import java.security.cert.CollectionCertStoreParameters;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CoffeeLover {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<String> coffees= Arrays.stream(scanner.nextLine().split(" " )).collect(Collectors.toList());

        int commands=Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < commands; i++) {
            String command=scanner.nextLine();
            String operator=command.split(" ")[0];

            switch (operator){
                case "Include":
                    String coffee=command.split(" ")[1];
                    coffees.add(coffee);
                    break;
                case "Remove":
                    String direction=command.split(" ")[1];
                    int removingNumbers=Integer.parseInt(command.split(" ")[2]);

                    if(direction.equals("first")){
                        removeFirstN(coffees,removingNumbers);
                    }else if(direction.equals("last")){
                        removeLastN(coffees,removingNumbers);
                    }
                    break;
                case "Prefer":
                    int index1=Integer.parseInt(command.split(" ")[1]);
                    int index2=Integer.parseInt(command.split(" ")[2]);
                    changePlaces(coffees,index1,index2);
                    break;
                case "Reverse":
                    Collections.reverse(coffees);
                    break;
            }
        }
        printList(coffees);
    }
    public static void removeFirstN(List<String>coffees,int indexes){
        if(indexes<coffees.size()){
            for (int i = 0; i < indexes; i++) {
                coffees.remove(0);
            }
        }
    }

    public static void removeLastN(List<String>coffees,int indexes){
        if(indexes<coffees.size()){
            for (int i = 0; i < indexes; i++) {
                coffees.remove(coffees.size()-1);
            }
        }
    }

    public static void changePlaces(List<String> coffees,int index1,int index2){
        if(index1< coffees.size()&& index2< coffees.size()){
            String temp=coffees.get(index1);
            coffees.set(index1,coffees.get(index2));
            coffees.set(index2,temp);
        }
    }
    public static void printList(List<String>coffees){
        System.out.println("Coffees:");
        for (String coffee:coffees) {
            System.out.print(coffee+" ");
        }
    }
}
