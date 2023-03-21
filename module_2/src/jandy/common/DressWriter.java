package jandy.common;

import jandy.model.Dress;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class DressWriter {
  public static void write(String path,Dress dress){
      BufferedWriter bufferedWriter=null;
      try {
          bufferedWriter=new BufferedWriter(new FileWriter(path));
          bufferedWriter.write(dress.toCSV());
          bufferedWriter.newLine();
          bufferedWriter.close();
      } catch (IOException e) {
          throw new RuntimeException(e);
      }
  }

}
