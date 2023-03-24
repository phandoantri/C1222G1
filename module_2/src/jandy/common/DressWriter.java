package jandy.common;

import jandy.model.Dress;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class DressWriter {
    public static void write(String path1,List<Dress> dressList){
        BufferedWriter bufferedWrite=null;
        try {
            bufferedWrite =new BufferedWriter(new FileWriter(path1));
            for (Dress dress:dressList){
                bufferedWrite.write(dress.toCSV());
                bufferedWrite.newLine();
            }
            bufferedWrite.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
