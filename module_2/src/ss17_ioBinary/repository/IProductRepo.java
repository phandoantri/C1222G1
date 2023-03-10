package ss17_ioBinary.repository;

import ss17_ioBinary.model.Product;

import java.util.List;

public interface IProductRepo {
    List<Product> display();
    void add(Product product);
}
