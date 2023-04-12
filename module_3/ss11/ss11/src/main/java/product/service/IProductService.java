package product.service;

import product.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> getOn();
    void save(Product product);
    Product findByName(String name);
}
