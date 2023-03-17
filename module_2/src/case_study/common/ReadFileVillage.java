package case_study.common;

import case_study.model.Villa;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFileVillage {
    public static List<Villa> read(String path){
        List<Villa> villaList=new ArrayList<>();
        BufferedReader bufferedReader=null;
        try {
            bufferedReader=new BufferedReader(new FileReader(path));
            String temp="";
            Villa villa;
            String[] tempArr;
            while ((temp=bufferedReader.readLine())!=null){
                tempArr=temp.split(",");
                villa=new Villa(tempArr[0],Double.parseDouble(tempArr[1]),Double.parseDouble(tempArr[2]),Integer.parseInt(tempArr[3]),tempArr[4],tempArr[5],Double.parseDouble(tempArr[6]),Integer.parseInt(tempArr[7]));
                villaList.add(villa);
            }
            bufferedReader.close();

        } catch (FileNotFoundException e) {
            e.fillInStackTrace();
        } catch (IOException e) {
            e.fillInStackTrace();
        }
        return villaList;
    }
}
