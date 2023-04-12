package product.repository;

import product.model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> getOn();
    void save(Product product);
    Product findByName(String name);
}
