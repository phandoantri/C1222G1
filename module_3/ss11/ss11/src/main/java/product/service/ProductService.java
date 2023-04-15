package product.service;

import product.model.Product;
import product.repository.IProductRepository;
import product.repository.ProductRepository;

import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService {
    private IProductRepository iProductRepository = new ProductRepository();
    Scanner sc = new Scanner(System.in);

    @Override
    public List<Product> getOn() {
        return iProductRepository.getOn();
    }

    @Override
    public void save(Product product) {
        iProductRepository.save(product);
    }

    @Override
    public List<Product> findByName(String name) {
        return iProductRepository.findByName(name);

    }

    @Override
    public void deleteId(int id) {
        iProductRepository.deleteId(id);
    }

    @Override
    public Product findById(int id) {
        Product product = iProductRepository.findById(id);
        return product;
//       return null;
    }

    @Override
    public void update(int id ,Product product) {
       iProductRepository.update(id,product);
    }
}
