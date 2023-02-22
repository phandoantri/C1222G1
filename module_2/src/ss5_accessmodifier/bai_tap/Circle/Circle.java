package ss5_accessmodifier.bai_tap.Circle;

public class Circle {
    private double radius = 1.0;
    private String color = "red";



    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

     protected double getRadius() {
        return this.radius;
    }

    protected double getAria() {
        return this.radius / 2;
    }

}
