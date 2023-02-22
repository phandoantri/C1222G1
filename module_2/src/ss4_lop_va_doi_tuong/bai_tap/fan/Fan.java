package ss4_lop_va_doi_tuong.bai_tap.fan;

public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    int speed = SLOW;
    boolean on = false;
    double radius = 5;
    String color = "blue";

    public int setSpeed(int speed) {
        this.speed = speed;
        return this.speed;
    }

    public int getSpeed() {
        return this.speed;

    }

    public boolean getOn() {
        on = false;
        return false;
    }

    public boolean getOff() {

        on = true;
        return true;
    }

    public double setRadius(double radius) {
        this.radius = radius;
        return this.radius;
    }

    public double getRadius() {

        return this.radius;
    }

    public String setColor(String color) {
        this.color = color;
        return this.color;
    }

    public String getColor() {

        return this.color;
    }

    String fan() {
        if (on) {
            System.out.println("color : " + this.color + ",radius : " + this.radius + " ,fan is off");
        } else {
            System.out.println("color : " + this.color + ", radius :" + this.radius + ", speed :" + this.speed + "fan is on");
        }
        return toString();
    }

}
