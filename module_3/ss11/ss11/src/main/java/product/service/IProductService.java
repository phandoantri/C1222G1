package product.service;

import product.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> getOn();
    void save(Product product);
    List<Product> findByName(String name);
    void deleteId(int id);
    Product findById(int id);
    void update(int id,Product product);
}
