package Constructors;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lines = Integer.parseInt(scanner.nextLine());

        List<Car> cars=new ArrayList<>();

        for (int i = 0; i < lines; i++) {
            String[] data=scanner.nextLine().split(" ");
            String brand=data[0];

            if(data.length==1){
                Car car=new Car(brand);
                cars.add(car);

            }else{
                String model=data[1];
                int horsePower=Integer.parseInt(data[2]);
                Car car=new Car(brand,model,horsePower);
                cars.add(car);
            }
        }

        for(Car car : cars){
            System.out.println(car.carInfo());
        }
    }

}
