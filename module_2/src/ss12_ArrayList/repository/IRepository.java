package ss12_ArrayList.repository;

import ss12_ArrayList.model.Product;

public interface IRepository {
    void display();
    void delete(String id);
    void search(String product);
    void addProduct(Product product);
}
