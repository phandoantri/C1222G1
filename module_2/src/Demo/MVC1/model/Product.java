package Demo.MVC1.model;

public class Product {
    private String name;
    private String id;
    private String productDay;

    public Product() {
    }

    public Product(String name, String id, String productDay) {
        this.name = name;
        this.id = id;
        this.productDay = productDay;
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

    public String getProductDay() {
        return productDay;
    }

    public void setProductDay(String productDay) {
        this.productDay = productDay;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", productDay='" + productDay + '\'' +
                '}';
    }
}
