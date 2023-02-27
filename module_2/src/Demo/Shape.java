package Demo;

public abstract class Shape {
    private String color;
    private boolean fill;
    public Shape(){

    }

    public Shape(String color, boolean fill) {
        this.color = color;
        this.fill = fill;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFill(boolean b) {
        return fill;
    }

    public void setFill(boolean fill) {
        this.fill = fill;
    }


    abstract double getAria();
}
