package RawData;

public class Car {
    private String model;
    private Engine engine;
    private Cargo cargo;
    private Tire[] tires=new Tire[4] ;

    public Car(String model,Engine engine,Cargo cargo, Tire[] tires){
        this.model=model;
        this.engine=engine;
        this.cargo=cargo;
        this.tires=tires;
    }

    public Cargo getCargo(){
        return this.cargo;
    }

    public Tire[] getTires(){
        return this.tires;
    }

    public String getModel(){
        return this.model;
    }

    public Engine getEngine(){
        return this.engine;
    }
}
