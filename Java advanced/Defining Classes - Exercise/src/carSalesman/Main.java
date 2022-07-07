package carSalesman;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int enginesCount=Integer.parseInt(scanner.nextLine());

        List<Engine> engineList=new ArrayList<>();
        List<Car> carList=new ArrayList<>();

        for (int i = 0; i <enginesCount ; i++) {
            String[] data=scanner.nextLine().split(" ");
            String model=data[0];
            int power=Integer.parseInt(data[1]);

            Engine engine=null;
            switch (data.length){
                case 2:
                 engine=new Engine(model,power);
                    break;
                case 3:
                    if(data[2].matches("\\d+")){
                        int displacement=Integer.parseInt(data[2]);
                        engine=new Engine(model,power,displacement);
                    }else{
                        String efficiency=data[2];
                        engine=new Engine(model,power,efficiency);
                    }
                    break;
                case 4:
                     int displacement=Integer.parseInt(data[2]);
                    String efficiency=data[3];
                    engine=new Engine(model,power,displacement,efficiency);
                    break;
            }

            engineList.add(engine);

        }

        int carsNumber=Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < carsNumber; i++) {
            String[] data=scanner.nextLine().split(" ");
            String model=data[0];
            String engineModel=data[1];

            Engine engine=findEngine(engineList,engineModel);
            Car car=null;

            switch (data.length){
                case 2:
                    car=new Car(model,engine);
                    break;
                case 3:
                    if(data[2].matches("\\d+")){
                        int weight=Integer.parseInt(data[2]);
                        car=new Car(model,engine,weight);
                    }else{
                        String color=data[2];
                        car=new Car(model,engine,color);
                    }
                    break;
                case 4:
                    int weight=Integer.parseInt(data[2]);
                    String color=data[3];

                    car=new Car(model,engine,weight,color);
                    break;
            }
            carList.add(car);
        }

        printCars(carList);

    }

    private static void printCars(List<Car> carList) {
        for (int i = 0; i < carList.size(); i++) {
            carList.get(i).print();
        }
    }

    private static Engine findEngine(List<Engine> engineList, String engineModel) {

        Engine engine=null;
        for (int i = 0; i < engineList.size(); i++) {
            if(engineList.get(i).getModel().equals(engineModel)){
                engine=engineList.get(i);
                break;
            }

        }
        return  engine;
    }
}
