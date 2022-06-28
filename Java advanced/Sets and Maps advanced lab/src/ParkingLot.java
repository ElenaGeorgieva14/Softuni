import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class ParkingLot {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();

        Set<String> cars=new LinkedHashSet<>();


        while(!input.equals("END")){
          String[] data=input.split(", ");
          String command=data[0];
          String number=data[1];

          if(command.equals("IN")){
              cars.add(number);
          }else{
              cars.remove(number);
          }

            input=scanner.nextLine();
        }

        if(cars.isEmpty()){
            System.out.println("Parking Lot is Empty");
        }else {
            for (String number : cars) {
                System.out.println(number);
            }
        }
    }
}
