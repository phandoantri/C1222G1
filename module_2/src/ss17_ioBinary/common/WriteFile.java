package ss17_ioBinary.common;

import ss17_ioBinary.model.Product;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WriteFile {
    public static List<Product> write(String path, List<Product> productList) {

        BufferedWriter bufferedWriter;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(path));
            for (Product product1 : productList) {
                System.out.println(product1.toString());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return productList;

    }
}
