package ss17_ioBinary.service;

import ss17_ioBinary.model.Product;
import ss17_ioBinary.repository.ProductRepo;

import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService{

    Scanner sc=new Scanner(System.in);
   private ProductRepo productRepo=new ProductRepo();

    @Override
    public void display() {
        List<Product> productList=productRepo.display();
        for (Product product:productList){
            System.out.println(product);

        }
    }

    @Override
    public void add() {
        System.out.println("nhap id ");
        String id=sc.nextLine();
        System.out.println("nhap name ");
        String name=sc.nextLine();
        System.out.println("nhap cost ");
         double cost=Double.parseDouble(sc.nextLine());
        Product product=new Product(id,name,cost);
        productRepo.add(product);
    }
}
