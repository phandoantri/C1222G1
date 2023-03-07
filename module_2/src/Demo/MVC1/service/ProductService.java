package Demo.MVC1.service;

import Demo.MVC1.model.Product;
import Demo.MVC1.repository.ProductRepo;

import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService{
    ProductRepo productRepo=new ProductRepo();
    Scanner sc=new Scanner(System.in);
    @Override
    public void display() {
        List<Product> productList=productRepo.display();
        for (Product product:productList){
            System.out.println(product);
        }
    }

    @Override
    public void add() {
        System.out.println("enter name");
        String name=sc.nextLine();
        System.out.println("enter id");
        String id=sc.nextLine();
        System.out.println("enter productDay");
        String productDay=sc.nextLine();
        Product product =new Product(name,id,productDay);
        productRepo.add(product);
    }

    @Override
    public void delete(String id) {
        productRepo.delete(id);
    }
}
