package carSalesman;

import javax.crypto.EncryptedPrivateKeyInfo;

public class Car {
    private String model;
    private Engine engine;
    private int weight;
    private String color;

    public Car(String model,Engine engine){
        this.model=model;
        this.engine=engine;
        this.color="n/a";
    }

    public Car(String model,Engine engine,int weight){
        this(model,engine);
        this.weight=weight;
        this.color="n/a";
    }

    public Car(String model, Engine engine,String color){
        this(model,engine);
        this.color=color;
    }

    public Car(String model,Engine engine,int weight,String color){
        this(model,engine,weight);
        this.color=color;
    }

    public void print(){
        if(weight==0){
            System.out.printf("%s:\n" +
                    "%s:\n" +
                    "Power: %d\n" +
                    "Displacement: %d\n" +
                    "Efficiency: %s\n" +
                    "Weight: n/a\n" +
                    "Color: %s\n",
                    model,engine.getModel(),engine.getPower(),
                    engine.getDisplacement(),engine.getEfficiency(),color);
        }else if(engine.getDisplacement()==0) {
            System.out.printf("%s:\n" +
                            "%s:\n" +
                            "Power: %d\n" +
                            "Displacement: n/a\n" +
                            "Efficiency: %s\n" +
                            "Weight: %d\n" +
                            "Color: %s\n",
                    model,engine.getModel(),engine.getPower(),
                    engine.getEfficiency(),weight,color);
        }else if(engine.getDisplacement()==0 && weight==0){
            System.out.printf("%s:\n" +
                            "%s:\n" +
                            "Power: %d\n" +
                            "Displacement: n/a\n" +
                            "Efficiency: %s\n" +
                            "Weight: n/a\n" +
                            "Color: %s\n",
                    model,engine.getModel(),engine.getPower()
                    ,engine.getEfficiency(),color);
        }else{
            System.out.printf("%s:\n" +
                            "%s:\n" +
                            "Power: %d\n" +
                            "Displacement: %d\n" +
                            "Efficiency: %s\n" +
                            "Weight: %d\n" +
                            "Color: %s\n",
                    model,engine.getModel(),engine.getPower(),
                    engine.getDisplacement(),engine.getEfficiency(),weight,color);
        }
    }
}
