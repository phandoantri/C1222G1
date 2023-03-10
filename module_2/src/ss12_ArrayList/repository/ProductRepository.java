package ss12_ArrayList.repository;

import ss12_ArrayList.model.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ProductRepository implements IRepository{
    static List<Product> productList=new ArrayList<>();
    static {
        productList.add(new Product("vinamilk","1122",13000));
        productList.add(new Product("nutri","1223",12000));
    }


    @Override
    public void display() {
        for (Product product:productList){
            System.out.println(product);
        }
    }

    @Override
    public void delete(String id) {
        for (int i = 0; i <productList.size() ; i++) {
            if (productList.get(i).getId().equals(id)){
                productList.remove(productList.get(i));
                return;
            }
        }
        System.out.println("khong tim thay ten id trong list ");
    }

    @Override
    public void search(String product) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getName().equals(product)){
                System.out.println(productList.get(i));
            }

        }
    }

    @Override
    public void addProduct(Product product) {

        productList.add(product);

    }


}
