package ss5_accessmodifier.bai_tap.Circle;

public class Circle {
    private double radius = 1.0;
    private String color = "red";



    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

     public double getRadius() {
        return this.radius;
    }

    public double getAria() {
        return this.radius / 2;
    }

}
