package jandy.model;

public class Dress {
  private String name;
  private String color;
  private double cost;

    public Dress() {
    }

    public Dress(String name, String color, double cost) {
        this.name = name;
        this.color = color;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Dress{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", cost=" + cost +
                '}';
    }
    public String toCSV(){
        return name+","+color+","+cost;
    }
}
