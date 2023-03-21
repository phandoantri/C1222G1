package jandy.common;

import jandy.model.Dress;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DressReader {
  public static List<Dress> read(String path){
      List<Dress> dressList=new ArrayList<>();
      BufferedReader bufferedReader=null;
      try {
          bufferedReader=new BufferedReader(new FileReader(path));
          String temp="";
          Dress dress;
          String[] teamArr;
          while ((temp=bufferedReader.readLine())!=null){
              teamArr=temp.split(",");
              dress=new Dress(teamArr[0],teamArr[1],Double.parseDouble(teamArr[2]));
              dressList.add(dress);
          }
          bufferedReader.close();
      } catch (FileNotFoundException e) {
          e.fillInStackTrace();
      } catch (IOException e) {
          e.fillInStackTrace();
      }
      return dressList;
  }

}
