package RawData;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int carsNumber=Integer.parseInt(scanner.nextLine());

        List<Car> carList=new ArrayList<>();

        for (int i = 0; i < carsNumber; i++) {
            String[] data=scanner.nextLine().split(" ");
            String model=data[0];

            //create Engine
            int engineSpeed=Integer.parseInt(data[1]);
            int enginePower=Integer.parseInt(data[2]);
            Engine engine=new Engine(engineSpeed,enginePower);

            //create Cargo
            int cargoWeight=Integer.parseInt(data[3]);
            String cargoType=data[4];
            Cargo cargo=new Cargo(cargoWeight,cargoType);

            //create Tires

            Tire[] tires=new Tire[4];
            int tiresIndex=0;

            for (int j = 5; j <data.length ; j+=2) {
                double pressure=Double.parseDouble(data[j]);
                int age=Integer.parseInt(data[j+1]);

                Tire tire=new Tire(pressure,age);
                tires[tiresIndex]=tire;
                tiresIndex++;
            }

            Car car=new Car(model,engine,cargo,tires);
            carList.add(car);
        }

        String command= scanner.nextLine();

        if(command.equals("fragile")){
            printFragile(carList);

        }else if (command.equals("flamable")){
            printFlamables(carList);
        }

    }

    private static void printFlamables(List<Car> carList) {
        for (int i = 0; i < carList.size(); i++) {
            Car car=carList.get(i);

            if(car.getCargo().getType().equals("flamable") &&
                    car.getEngine().getPower()>250){
                System.out.println(car.getModel());
            }
        }
    }

    private static void printFragile(List<Car> carList) {
        for (int i = 0; i < carList.size(); i++) {
            Car car=carList.get(i);

            if(car.getCargo().getType().equals("fragile")){
                Tire[] tires=car.getTires();

                for (int j = 0; j < tires.length; j++) {
                    if(tires[j].getPressure()<1){
                        System.out.println(car.getModel());
                        break;
                    }
                }
            }
        }
    }
}
