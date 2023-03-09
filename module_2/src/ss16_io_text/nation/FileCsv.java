package ss16_io_text.nation;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileCsv {

    public static void main(String[] args) {
        Nation nation = new Nation("1", "AU", "Australia");
        Nation nation1 = new Nation("2", "VN", "Viet Nam");
        Nation nation2 = new Nation("3", "L", "Lao");
        Nation nation3 = new Nation("4", "USA", "American");
        Nation nation4 = new Nation("5", "GER", "Germany");
        List<Nation> list = new ArrayList<>();
        list.add(nation);
        list.add(nation1);
        list.add(nation2);
        list.add(nation3);
        list.add(nation4);
        FileReader fileReader=null;
        BufferedReader bufferedReader=null;
        
        try {
             fileReader = new FileReader("src/ss16_io_text/nation/file.txt");
            bufferedReader = new BufferedReader(fileReader);
            String line="";
            while (true){
                line=bufferedReader.readLine();
                if (line==null){
                    break;
                }

                System.out.println(line);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.fillInStackTrace();
        }
    }
}
