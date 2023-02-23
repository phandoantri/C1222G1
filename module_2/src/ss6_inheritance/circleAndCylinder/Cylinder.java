package ss6_inheritance.circleAndCylinder;

public class Cylinder extends CircleAndCylinder {
    private  int height=2;
   private int length =4;
   private int width =5;

    public Cylinder() {
    }

    public Cylinder(int height, int length, int width) {
        this.height = height;
        this.length = length;
        this.width = width;
    }

    public Cylinder( int height, int length, int width,String color,double radius) {
        super(radius,color);
        this.height = height;
        this.length = length;
        this.width = width;

    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    public double getColumn(){
        return this.height*this.width*this.length;
  }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                ", length=" + length +
                ", width=" + width +super.toString()+ "column = "+getAria()+
                '}';
    }
}
