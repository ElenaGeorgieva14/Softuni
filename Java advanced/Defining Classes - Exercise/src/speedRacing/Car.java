package speedRacing;

public class Car {
    private String model;
    private double fuelAmount;
    private double fuelCost;
    private int distanceTraveled;

    public Car(String model,double fuelAmount,double fuelCost){
        this.model=model;
        this.fuelAmount=fuelAmount;
        this.fuelCost=fuelCost;
        this.distanceTraveled=0;
    }

    public void canDrive(int distance){
        double kmLeft=fuelAmount/fuelCost;

        if(kmLeft>=distance){
            fuelAmount-=distance*fuelCost;
            distanceTraveled+=distance;

        }else{
            System.out.println("Insufficient fuel for the drive");
        }
    }

    public String getModel(){
        return this.model;
    }

    public double getFuelAmount(){
        return this.fuelAmount;
    }

    public int getDistanceTraveled(){
        return this.distanceTraveled;
    }

}
