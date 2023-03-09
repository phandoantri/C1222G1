package ss17_ioBinary.demByte;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        int count=0;
        try {
            fis = new FileInputStream("src/ss16_io_text/file.txt");
            fos = new FileOutputStream("src/ss17_ioBinary/demByte/byteCount");
            int line;

            byte[] buffer = new byte[1024];
            while ((line = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, line);
                count+=line;
            }
            System.out.println(count);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                fis.close();
                fos.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }


    }
}
