package speedRacing;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int carsNum=Integer.parseInt(scanner.nextLine());

        Map<String,Car> cars=new LinkedHashMap<>();

        for (int i = 0; i < carsNum; i++) {
            String[] data=scanner.nextLine().split(" ");
            String model=data[0];
            double fuelAmount=Double.parseDouble(data[1]);
            double fuelCost=Double.parseDouble(data[2]);

            Car car=new Car(model,fuelAmount,fuelCost);
            cars.putIfAbsent(model,car);
        }

        String input=scanner.nextLine();

        while(!input.equals("End")){
            String[] data=input.split(" ");
            String model=data[1];
            int distance=Integer.parseInt(data[2]);

            cars.get(model).canDrive(distance);
            input=scanner.nextLine();
        }

        Set<Map.Entry<String,Car>> entries=cars.entrySet();

        for(var entry : entries){
            System.out.printf("%s %.2f %d%n",
                    entry.getKey(),entry.getValue().getFuelAmount(),
                    entry.getValue().getDistanceTraveled());
        }
    }
}
