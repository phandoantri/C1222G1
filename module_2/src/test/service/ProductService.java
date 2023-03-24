package test.service;

import test.model.Product;
import test.repository.IProductRepository;
import test.repository.ProductRepository;

import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService{
    private IProductRepository iProductRepository=new ProductRepository();
    Scanner sc=new Scanner(System.in);

    @Override
    public void display() {
        List<Product> productList=iProductRepository.display();
        for (Product product:productList){
            System.out.println(product);
        }
    }

    @Override
    public void add() {
        List<Product> productList=iProductRepository.display();
        System.out.println("enter name ");
        String name=sc.nextLine();
        System.out.println("enter id ");
        String id=sc.nextLine();
        System.out.println("enter cost ");
        String cost=sc.nextLine();
        Product product=new Product(name,id,cost);
        productList.add(product);
        iProductRepository.add(productList);
    }

    @Override
    public void delete() {
        List<Product> productList=iProductRepository.display();
        System.out.println("enter name ");
        String name=sc.nextLine();
        for (int i=0;i<productList.size();i++){
            if (productList.get(i).getName().equals(name)){
                iProductRepository.delete(i);
                return;
            }
        }
        System.out.println("khong tim thay");
    }

    @Override
    public void search() {
        List<Product> productList=iProductRepository.display();
        System.out.println("enter id ");
        String id=sc.nextLine();
        for (int i=0;i<productList.size();i++){
            if (productList.get(i).getId().equals(id)){
                iProductRepository.search(i);
                return;
            }
        }
    }
}
