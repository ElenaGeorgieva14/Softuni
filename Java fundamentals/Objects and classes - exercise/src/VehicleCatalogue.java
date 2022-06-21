import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
public class VehicleCatalogue {
    static class Vehicle{
        String type;
        String model;
        String color;
        int horsePower;

        Vehicle(String type, String model, String color, int horsePower){
            this.type=type;
            this.model=model;
            this.color=color;
            this.horsePower=horsePower;
        }

         String getType(){
            return this.type;
        }

        void setType(String type){
            this.type=type;
        }

        String getModel(){
            return this.model;
        }
        void setModel(String model){
            this.model=model;
        }

        String getColor(){
            return this.color;
        }
        void setColor(String color){
            this.color=color;
        }

        int getHorsePower() {
            return this.horsePower;
        }

        void setHorsePower(int horsePower){
            this.horsePower=horsePower;
        }

        @Override
        public String toString(){
            return String.format("Type: %s\n" +
                    "Model: %s\n" +
                    "Color: %s\n" +
                    "Horsepower: %d",
                    this.getType().split("")[0].toUpperCase()+this.getType().replace(this.getType().split("")[0],""),
                    this.getModel(),this.getColor(),this.getHorsePower());
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Vehicle> vehicleList = new ArrayList<>();

        int sumTruckHP = 0;
        int countTruck = 0;
        int sumCarHP = 0;
        int countCar = 0;

        while (!input.equals("End")) {
            String[] data = input.split(" ");
            if (data[0].equals("truck")) {
                sumTruckHP += Integer.parseInt(data[3]);
                countTruck++;
            } else {
                sumCarHP += Integer.parseInt(data[3]);
                countCar++;
            }
            Vehicle vehicle = new Vehicle(data[0], data[1], data[2], Integer.parseInt(data[3]));
            vehicleList.add(vehicle);

            input = scanner.nextLine();
        }
        while (!input.equals("Close the Catalogue")) {
            for (int i = 0; i < vehicleList.size(); i++) {
                if (vehicleList.get(i).getModel().equals(input)) {
                    System.out.println(vehicleList.get(i).toString());
                }
            }
            input = scanner.nextLine();
        }
        double averageCarHP=sumCarHP*1.0/countCar;
        double averageTruckHP=sumTruckHP * 1.0 / countTruck;

        if (countTruck <= 0) {
            averageTruckHP=0.00;
        }

        if(countCar <= 0){
            averageCarHP=0.00;
        }

        System.out.printf("Cars have average horsepower of: %.2f.%n", averageCarHP);
        System.out.printf("Trucks have average horsepower of: %.2f.", averageTruckHP);
    }
}
