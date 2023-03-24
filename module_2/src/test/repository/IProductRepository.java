package test.repository;

import test.model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> display();
    void add(List<Product> productList);
    void delete(int i);
    void search(int i);
}
