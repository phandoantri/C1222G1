package ss18_binary.repository;

import ss18_binary.model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> display();
    void add(Product products);
    void search(String name);
}
