package ss17_ioBinary.repository;

import ss17_ioBinary.common.ReadFile;
import ss17_ioBinary.common.WriteFile;
import ss17_ioBinary.model.Product;
import sun.applet.Main;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductRepo implements IProductRepo {

    public static final String PATH="src/ss17_ioBinary/data/file.txt";

       List<Product> productList =new ArrayList<>();

    @Override
    public List<Product> display() {
        return  ReadFile.read(PATH);


    }

    @Override
    public void add(List<Product> product) {
        WriteFile.write(PATH,product);
    }
}