package ss17_ioBinary.service;

import ss17_ioBinary.model.Product;
import ss17_ioBinary.repository.ProductRepo;

import java.util.List;

public class ProductService implements IProductService{
   private ProductRepo productRepo=new ProductRepo();
    @Override
    public void display() {
        List<Product> productList=productRepo.display();
        for (Product product:productList){
            System.out.println(product);
        }


    }
}
