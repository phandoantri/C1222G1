package test.model;

public class Product {
    private String name;
    private String id;
    private String cost;

    public Product() {
    }

    public Product(String name, String id, String cost) {
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

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", cost='" + cost + '\'' +
                '}';
    }

    public String toCSV() {
        return name + "," + id + "," + cost;
    }
}
