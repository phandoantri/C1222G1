package ss4_lop_va_doi_tuong.bai_tap.fan;

public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    int speed = SLOW;
    boolean on = false;
    double radius = 5;
    String color = "blue";

    public int setspeed(int Speed) {
        this.speed = Speed;
        return this.speed;
    }


    public int getspeed() {
        return this.speed;

    }

    public boolean geton() {
        on = false;
        return false;
    }

    public boolean getoff() {

        on = true;
        return true;
    }

    public double setradius(double Radius) {
        this.radius = Radius;
        return this.radius;
    }

    public double getRadius() {

        return this.radius;
    }

    public String setcolor(String Color) {
        this.color = Color;
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
