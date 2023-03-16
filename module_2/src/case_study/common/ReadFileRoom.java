package case_study.common;

import case_study.model.House;
import case_study.model.Room;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFileRoom {
    public static List<Room> read(String path){
        List<Room> roomList=new ArrayList<>();
        BufferedReader bufferedReader=null;
        try {
            bufferedReader=new BufferedReader(new FileReader(path));
            String temp="";
            Room room;
            String[] tempArr;
            while ((temp=bufferedReader.readLine())!=null){
                tempArr=temp.split(",");
                room=new Room(tempArr[0],Double.parseDouble(tempArr[1]),Double.parseDouble(tempArr[2]),Integer.parseInt(tempArr[3]),tempArr[4],tempArr[5]);
                roomList.add(room);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.fillInStackTrace();
        } catch (IOException e) {
            e.fillInStackTrace();
        }
        return roomList;
    }
}
