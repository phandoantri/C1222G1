package ss17_ioBinary.repository;

import ss17_ioBinary.model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductRepo implements IProductRepo {
    static List<Product> productList = new ArrayList<>();

    static {
        productList.add(new Product("1", "coca", 12000));
        productList.add(new Product("2", "lavi", 13000));
        productList.add(new Product("3", "sting", 14000));
    }


    @Override
    public List<Product> display() {
        return productList;
    }
}