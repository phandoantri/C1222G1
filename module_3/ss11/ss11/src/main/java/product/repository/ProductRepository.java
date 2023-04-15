package product.repository;

import product.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {
    public static List<Product> productList = new ArrayList<>();

    static {
        productList.add(new Product(1, "sua", 12000));
        productList.add(new Product(2, "ao", 13000));
        productList.add(new Product(3, "quan", 14000));
    }

    @Override
    public List<Product> getOn() {
        return productList;
    }

    @Override
    public void save(Product product) {
        productList.add(product);
    }

    @Override
    public List<Product> findByName(String name) {
        List<Product> products = new ArrayList<>();
        for (Product product : productList) {
            if (product.getName().contains(name)) {
                products.add(product);
            }
        }
        return products;
    }

    @Override
    public void deleteId(int id) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == id) {
                productList.remove(i);
                break;
            }
        }
    }

    @Override
    public Product findById(int id) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == id) {
                 return productList.get(i);
            }
        }
        return null;
    }

    @Override
    public void update(int id,Product product) {
for (int i=0;i<productList.size();i++){
    if (productList.get(i).getId()==id){
        productList.set(i,product);
        break;
    }
}

    }
}
