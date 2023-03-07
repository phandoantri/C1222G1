package Demo.MVC1.repository;

import Demo.MVC1.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepo implements IProductRepo{
    static List<Product> productList=new ArrayList<>();
    static {
        productList.add(new Product("ninamilk","1234","12/2/23"));
        productList.add(new Product("coca","34","12/2/23"));
    }

    @Override
    public List<Product> display() {
        return productList;
    }

    @Override
    public void add(Product product) {
        productList.add(product);
    }

    @Override
    public void delete(String id) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId().equals(id)){
                productList.remove(productList.get(i));
            }
        }
    }
}
