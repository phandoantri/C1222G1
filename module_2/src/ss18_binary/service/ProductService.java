package ss18_binary.service;

import ss18_binary.model.Product;
import ss18_binary.repository.IProductRepository;
import ss18_binary.repository.ProductRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService{
    Scanner sc=new Scanner(System.in);
    static ProductRepository productRepository=new ProductRepository();
    @Override
    public void display() {
        List<Product> productList=productRepository.display();
        for (Product product:productList){
            System.out.println(product);
        }

    }

    @Override
    public void add() {

        System.out.println("nhap id");
        String id=sc.nextLine();
        System.out.println("nhap ten");
        String name=sc.nextLine();
        System.out.println("nhap gia");
        String cost=sc.nextLine();
        Product product=new Product(id,name,cost);

       productRepository.add(product);

    }

    @Override
    public void search(String name) {
       productRepository.search(name);
    }
}
