package ss6_inheritance.circleAndCylinder;

public class CircleAndCylinder {
   private double radius=1;
   private String color="yellow";
    public CircleAndCylinder(){
    }
    public CircleAndCylinder(double radius,String color){
        this.color=color;
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    public void setColor(String color){
        this.color=color;

    }
    public String getColor(){
        return this.color;
    }
    public double getAria(){
        return this.radius*this.radius;
    }

    @Override
    public String toString() {
        return
                "radius=" + radius +"aria = " + getAria()+
                ", color='" + color + '\''
                ;
    }
}

