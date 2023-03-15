package ss18_binary.common;

import ss18_binary.model.Product;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class ReadBinaryFile {

    public static List<Product> read(String path) {
        List<Product> productList = new ArrayList<>();
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream(path);
            ois = new ObjectInputStream(fis);
            productList = (List<Product>) ois.readObject();
            fis.close();
            ois.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            e.fillInStackTrace();
        } catch (ClassNotFoundException e) {
            e.fillInStackTrace();
        }
        return productList;
    }
}
