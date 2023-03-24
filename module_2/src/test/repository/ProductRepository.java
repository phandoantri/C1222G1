package test.repository;

import test.common.ReadFileProduct;
import test.common.WriteFileProduct;
import test.model.Product;

import java.util.List;

public class ProductRepository implements IProductRepository{
    public static final String PATH="src/test/data/product_csv";
    @Override
    public List<Product> display() {
        return ReadFileProduct.read(PATH);
    }

    @Override
    public void add(List<Product> productList) {
        WriteFileProduct.write(PATH,productList);
    }

    @Override
    public void delete(int i) {
        List<Product> productList=ReadFileProduct.read(PATH);
        productList.remove(i);
        WriteFileProduct.write(PATH,productList);

    }

    @Override
    public void search(int i) {
        List<Product> productList=ReadFileProduct.read(PATH);
        System.out.println(productList.get(i));

    }
}
