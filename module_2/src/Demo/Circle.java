package Demo;

public class Circle extends Shape implements IColor {
    private double radius;

    public Circle() {

    }

    @Override
    double getAria() {
        return this.radius * this.radius;
    }

    public Circle(String color, boolean fill, double radius) {
        super(color, fill);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius + getAria() +
                '}';
    }

    @Override
    public void colorIs() {
        System.out.println("this is color "+ getColor());


    }
}