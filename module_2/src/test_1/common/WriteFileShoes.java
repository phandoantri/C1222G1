package test_1.common;

import test_1.model.Shoes;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteFileShoes {
    public static void write(String path, List<Shoes> shoesList){
        BufferedWriter bufferedWriter=null;
        try {
            bufferedWriter=new BufferedWriter(new FileWriter(path));
            for (Shoes shoes:shoesList){
                bufferedWriter.write(shoes.toCSV());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.fillInStackTrace();
        }
    }
}
