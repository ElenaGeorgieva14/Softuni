package carSalesman;

public class Engine {
    private String model;
    private int power;
    private int displacement;
    private String efficiency;


    public Engine(String model,int power){
        this.model=model;
        this.power=power;
        this.efficiency="n/a";
    }

    public Engine(String model,int power,int displacement){
        this(model,power);
        this.displacement=displacement;
        this.efficiency="n/a";

    }

    public Engine(String model,int power,String efficiency){
        this(model,power);
        this.efficiency=efficiency;
    }

    public Engine(String model, int power,int displacement,String efficiency){
        this (model,power,displacement);
        this.efficiency=efficiency;
    }

    public String getModel(){
        return this.model;
    }
    public String getEfficiency(){
        return this.efficiency;
    }
    public int getPower(){
        return this.power;
    }
    public int getDisplacement(){
        return this.displacement;
    }
}
