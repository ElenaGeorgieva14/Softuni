import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> peopleInWagons = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int maxCapacity = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String command = input.split(" ")[0];

            if (command.equals("Add")) {
                int passengers = Integer.parseInt(input.split(" ")[1]);
                addPassengers(peopleInWagons,passengers);
            }else{
                int people=Integer.parseInt(command);
                findPlaces(peopleInWagons,people,maxCapacity);
            }
            input = scanner.nextLine();
        }
        printList(peopleInWagons);
    }
    public static void addPassengers(List<Integer>wagons,int passengers){
        wagons.add(passengers);
    }

    public static void findPlaces(List<Integer>wagons,int people,int maxPeople){
        for (int i = 0; i < wagons.size(); i++) {
            if(wagons.get(i)+people <= maxPeople){
                wagons.set(i,wagons.get(i)+people);
                break;
            }
        }
    }

    public static void printList(List<Integer>wagons){
        for(int passengers : wagons){
            System.out.print(passengers+" ");
        }
    }
}
