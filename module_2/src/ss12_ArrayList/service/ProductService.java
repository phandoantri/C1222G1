package ss12_ArrayList.service;

import ss12_ArrayList.model.Product;
import ss12_ArrayList.repository.ProductRepository;

import java.util.Scanner;

public class ProductService implements IProductService {
    private ProductRepository productRepository = new ProductRepository();
    Scanner sc = new Scanner(System.in);

    @Override
    public void display() {
        productRepository.display();
    }

    @Override
    public void delete(String id) {
        productRepository.delete(id);
    }

    @Override
    public void search(String product) {
        productRepository.search(product);
    }

    @Override
    public void addProduct() {

        System.out.println("nhap ten san pham ");
        String name = sc.nextLine();
        System.out.println("nhap id san pham ");
        String id = sc.nextLine();
        System.out.println("nhap gia san pham ");
        double cost = Double.parseDouble(sc.nextLine());
        Product product = new Product(name, id, cost);
        productRepository.addProduct(product);
    }


}
