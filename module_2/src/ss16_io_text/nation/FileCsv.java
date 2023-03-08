package ss16_io_text.nation;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
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
        try {
            FileWriter fileWriter = new FileWriter("src/ss16_io_text/file.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Nation na : list) {
                bufferedWriter.write(na.toString());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.fillInStackTrace();
        }
    }
}
