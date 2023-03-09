package demo_MVC.common;

import demo_MVC.model.Truyen;
import demo_MVC.repository.TruyenRepository;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class WriteFile {
public static void writeFile(String path){
    TruyenRepository truyenRepository=new TruyenRepository();
    List<Truyen> truyenList=truyenRepository.hienThi();
    BufferedWriter bufferedWriter = null;
    try {
        FileWriter fileWriter=new FileWriter(path);
        bufferedWriter=new BufferedWriter(fileWriter);
        bufferedWriter.write(truyenList.toString());

    } catch (IOException e) {
        throw new RuntimeException(e);
    }finally {
        try {
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

}
