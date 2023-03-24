package test.common;

import test.model.Product;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteFileProduct {
    public static void write(String path,List<Product> productList){
        BufferedWriter bufferedWriter=null;
        try {
            bufferedWriter=new BufferedWriter(new FileWriter(path));
            for (Product product:productList){
                bufferedWriter.write(product.toCSV());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.fillInStackTrace();
        }
    }
}
