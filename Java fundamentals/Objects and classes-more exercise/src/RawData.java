import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RawData {
    static class Engine{
        int engineSpeed;
        int enginePower;

        Engine(int engineSpeed,int enginePower){
            this.engineSpeed=engineSpeed;
            this.enginePower=enginePower;
        }
    }

    static class Cargo{
        int cargoWeight;
        String cargoType;

        Cargo(int cargoWeight,String cargoType){
            this.cargoWeight=cargoWeight;
            this.cargoType=cargoType;
        }
    }

    static class Tires{
      double tirePressure;
      int tireAge;

      Tires(double tirePressure,int tireAge){
      this.tirePressure=tirePressure;
      this.tireAge=tireAge;
      }

    }

    static class Car{
        String model;
        Engine engine;
        Cargo cargo;
        Tires[] tiresArray=new Tires[4];


        Car(String model, Engine engine,Cargo cargo,Tires[] tiresArray){
            this.model=model;
            this.engine=engine;
            this.cargo=cargo;
            this.tiresArray=tiresArray;
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int carsNum=Integer.parseInt(scanner.nextLine());
        List<Car>carList=new ArrayList<>();

        for (int i = 0; i < carsNum; i++) {
            String input=scanner.nextLine();
            String[] data=input.split(" ");

            Engine engine = new Engine(Integer.parseInt(data[1]),Integer.parseInt(data[2]));
            Cargo cargo=new Cargo(Integer.parseInt(data[3]),data[4]);
            Tires tire1=new Tires(Double.parseDouble(data[5]),Integer.parseInt(data[6]));
            Tires tire2=new Tires(Double.parseDouble(data[7]),Integer.parseInt(data[8]));
            Tires tire3=new Tires(Double.parseDouble(data[9]),Integer.parseInt(data[10]));
            Tires tire4=new Tires(Double.parseDouble(data[11]),Integer.parseInt(data[12]));
            Tires[] tires={tire1,tire2,tire3,tire4};


            Car car=new Car(data[0],engine,cargo,tires);
            carList.add(car);
        }

        String finalCommand=scanner.nextLine();

        if(finalCommand.equals("fragile")){
            carList.stream()
                    .filter(car -> car.cargo.cargoType.equals("fragile") && Arrays.stream(car.tiresArray).anyMatch(tires -> tires.tirePressure<1))
                    .forEach(car -> System.out.println(car.model));
        }else if(finalCommand.equals("flamable")){
            carList.stream()
                    .filter(car -> car.cargo.cargoType.equals("flamable") && car.engine.enginePower>250)
                    .forEach(car -> System.out.println(car.model));
        }
    }
}
