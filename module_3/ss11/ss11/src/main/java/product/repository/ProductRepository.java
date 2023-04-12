package product.repository;

import product.model.Product;
import product.service.IProductService;
import product.service.ProductService;

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
    public Product findByName(String name) {
for (Product product:productList){
    if (product.getName().equals(name)){
        return product;
    }
}
        return null;
    }
}
