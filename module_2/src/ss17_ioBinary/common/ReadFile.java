package ss17_ioBinary.common;

import ss17_ioBinary.model.Product;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    public static List<Product> read(String path){
        List<Product> productList=new ArrayList<>();
        BufferedReader bufferedReader=null;
        try {
            bufferedReader=new BufferedReader(new FileReader(path));
            String str="";
            Product product;
            String[] temparr;
//            while ()


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        return productList;
    }

}
