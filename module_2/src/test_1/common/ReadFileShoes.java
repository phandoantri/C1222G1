package test_1.common;

import test_1.model.Shoes;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFileShoes {
    public static List<Shoes> read(String path){
        List<Shoes> shoesList=new ArrayList<>();
        BufferedReader bufferedReader=null;
        try {
            bufferedReader=new BufferedReader(new FileReader(path));
            String temp="";
            Shoes shoes;
            String[] tempArr;
            while ((temp=bufferedReader.readLine())!=null){
                tempArr= temp.split(",");
                shoes=new Shoes(tempArr[0],tempArr[1],Double.parseDouble(tempArr[2]));
                shoesList.add(shoes);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.fillInStackTrace();
        } catch (IOException e) {
            e.fillInStackTrace();
        }
        return shoesList;
    }
}
