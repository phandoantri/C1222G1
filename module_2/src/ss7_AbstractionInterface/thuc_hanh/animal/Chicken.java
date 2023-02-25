package ss7_AbstractionInterface.thuc_hanh.animal;

public class Chicken extends Animal implements IhowToEat{
    @Override
    public String makeSound() {
        return "Chicken : gruk gruk....!";
    }

    @Override
    public String howToEat() {
        return "Could ve fried";
    }
}
