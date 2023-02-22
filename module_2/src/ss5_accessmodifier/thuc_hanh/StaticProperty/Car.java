package ss5_accessmodifier.thuc_hanh.StaticProperty;

public class Car {
    public String name;

    public String engine;



    public static int numberOfCars;



    public Car(String name, String engine) {

        this.name = name;

        this.engine = engine;

        numberOfCars++;

    }
}
