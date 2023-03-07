package Demo.MVC1.repository;

import Demo.MVC1.model.Product;

import java.util.List;

public interface IProductRepo {
    List<Product> display();
    void add(Product product);
    void delete(String id);
}
