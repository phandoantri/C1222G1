package case_study.common;

import case_study.model.Villa;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFileVillage {
    public static void Write(String path, Villa villa){
        BufferedWriter bufferedWriter=null;
        try {
            bufferedWriter=new BufferedWriter(new FileWriter(path));
            bufferedWriter.write(villa.toString());
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
           e.fillInStackTrace();
        }
    }

}
