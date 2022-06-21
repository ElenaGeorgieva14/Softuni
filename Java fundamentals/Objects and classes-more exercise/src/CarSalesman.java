import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class CarSalesman {

    static class Car{
        String model;
        Engine engine;
        int weight;
        String color;

        Car(String model,Engine engine){
            this.model=model;
            this.engine=engine;
        }
        Car(String model,Engine engine,String color){
            this.model=model;
            this.engine=engine;
            this.color=color;
        }
        Car(String model,Engine engine,int weight){
            this.model=model;
            this.engine=engine;
            this.weight=weight;
        }
        Car(String model, Engine engine,int weight, String color){
            this.model=model;
            this.engine=engine;
            this.weight=weight;
            this.color=color;
        }

        String getModel(){
            return this.model;
        }
        void setModel(String model){
            this.model=model;
        }

        Engine getEngine(){
            return this.engine;
        }
        void setEngine(Engine engine){
            this.engine=engine;
        }

        String getWeight(){
            if(weight==0){
                return "n/a";
            }else{
                return this.weight+"";
            }

        }
        void setWeight(int weight){
            this.weight=weight;
        }

        String getColor(){
            if(color==null){
                return "n/a";
            }else {
                return this.color;
            }
        }
        void setColor(String color){
            this.color=color;
        }

        @Override
       public String toString(){
            return String.format("%s:\n" +
                    "  %s:\n" +
                    "    Power: %d\n" +
                    "    Displacement: %s\n" +
                    "    Efficiency: %s\n" +
                    "  Weight: %s\n" +
                    "  Color: %s",
                    this.getModel(),this.getEngine().getModel(),
                    this.getEngine().getPower(),this.getEngine().getDisplacement(),
                    this.getEngine().getEfficiency(),this.getWeight(),
                    this.getColor());

        }
    }

    static class Engine{
        String model;
        int power;
        int displacement;
        String efficiency;

        Engine (String model, int power){
            this.model=model;
            this.power=power;
        }
        Engine (String model, int power,int displacement){
            this.model=model;
            this.power=power;
            this.displacement=displacement;
        }
        Engine (String model, int power,String efficiency){
            this.model=model;
            this.power=power;
            this.efficiency=efficiency;
        }
        Engine(String model, int power, int displacement, String efficiency){
            this.model = model;
            this.power=power;
            this.displacement=displacement;
            this.efficiency=efficiency;
        }

        String getModel(){
            return this.model;
        }
        void setModel(String model) {
            this.model = model;
        }

        int getPower(){
            return this.power;
        }
        void setPower(int power){
            this.power=power;
        }

        String getDisplacement(){
            if(displacement==0 ){
               return "n/a";
            }else {
                return this.displacement + "";
            }
        }
        void setDisplacement(int displacement){
            this.displacement=displacement;
        }

        String getEfficiency(){
            if(efficiency== null){
                return "n/a";
            }else {
                return this.efficiency;
            }
        }
        void setEfficiency(String efficiency){
            this.efficiency=efficiency;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int engineNum = Integer.parseInt(scanner.nextLine());
        List<Engine> engineList = new ArrayList<>();
        for (int i = 0; i < engineNum; i++) {
            String engineInput = scanner.nextLine();
            String[] data = engineInput.split(" ");

            if (data.length == 2) {
                Engine engine = new Engine(data[0], Integer.parseInt(data[1]));
                engineList.add(engine);
            } else if (data.length == 3 && data[2].charAt(0) >= 48 && data[2].charAt(0) <= 57) {
                Engine engine = new Engine(data[0], Integer.parseInt(data[1]), Integer.parseInt(data[2]));
                engineList.add(engine);
            } else if (data.length == 4) {
                Engine engine = new Engine(data[0], Integer.parseInt(data[1]), Integer.parseInt(data[2]), data[3]);
                engineList.add(engine);
            } else {
                Engine engine = new Engine(data[0], Integer.parseInt(data[1]), data[2]);
                engineList.add(engine);
            }
        }

        int carsNum=Integer.parseInt(scanner.nextLine());
        List<Car> cars=new ArrayList<>();
        for (int i = 0; i < carsNum; i++) {
            String carInput=scanner.nextLine();
            String[] data=carInput.split(" ");

           Engine engine=null;
           for(Engine engine1:engineList){
               if(engine1.getModel().equals(data[1])){
                   engine=engine1;
               }
           }
            if(data.length==2){
                Car car = new Car(data[0],engine);
                cars.add(car);
            }else if(data.length==3 && data[2].charAt(0) >= 48 && data[2].charAt(0) <= 57){
                Car car=new Car(data[0],engine,Integer.parseInt(data[2]));
                cars.add(car);
            }else if(data.length==4){
                Car car=new Car(data[0],engine,Integer.parseInt(data[2]),data[3]);
                cars.add(car);
            }else{
                Car car = new Car(data[0],engine,data[2]);
                cars.add(car);
            }
        }
        cars.stream()
                .forEach(car -> System.out.println(car.toString()));
    }
}
