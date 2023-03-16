package case_study.common;

import case_study.model.House;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFileHouse {
    public static List<House> read(String path){
        List<House> houseList=new ArrayList<>();
        BufferedReader bufferedReader=null;
        try {
            bufferedReader=new BufferedReader(new FileReader(path));
            String temp="";
            House house;
            String[] tempArr;
            while ((temp=bufferedReader.readLine())!=null){
                tempArr=temp.split(",");
                 house=new House(tempArr[0],Double.parseDouble(tempArr[1]),Double.parseDouble(tempArr[2]),Integer.parseInt(tempArr[3]),tempArr[4],tempArr[5],Integer.parseInt(tempArr[6]));
                houseList.add(house);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.fillInStackTrace();
        } catch (IOException e) {
            e.fillInStackTrace();
        }
        return houseList;
    }

}
