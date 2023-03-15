package ss18_binary.repository;

import ss18_binary.common.ReadBinaryFile;
import ss18_binary.common.WriteBinaryFile;
import ss18_binary.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {
    public static final String PATH = "src/ss18_binary/data/txt";
    static List<Product> productList = ReadBinaryFile.read(PATH);

    static {
        productList.add(new Product("1223", "milo", "12000"));
        productList.add(new Product("123", "coca", "1200"));
    }

    @Override
    public List<Product> display() {
        return ReadBinaryFile.read(PATH);

    }


    @Override
    public void add(Product product) {
        WriteBinaryFile.write(PATH, product);
    }

    @Override
    public void search(String name) {

        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getName().equals(name)) {
                System.out.println(productList.get(i));
            }
            System.out.println("k tim thay ten san pham");
        }

    }
}
