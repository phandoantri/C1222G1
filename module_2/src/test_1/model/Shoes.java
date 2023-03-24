package test_1.model;

public class Shoes {


    private String name;
    private String id;
    private double cost;

    public Shoes() {
    }

    public Shoes(String name, String id, double cost) {
        this.name = name;
        this.id = id;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Shoes{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", cost=" + cost +
                '}';
    }

    public String toCSV() {
        return name + "," + id + "," + cost;
    }
}
