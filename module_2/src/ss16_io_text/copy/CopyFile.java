package ss16_io_text.copy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    public static String sourceFile = "src/ss16_io_text/nation/file.txt";
    public static String targetFile = "src/ss16_io_text/copy/copyFile.txt";

    public static void main(String[] args) throws IOException {
        try (FileInputStream in = new FileInputStream(sourceFile);
             FileOutputStream out = new FileOutputStream(targetFile)) {
            int i;
            while ((i = in.read()) != -1) {
                out.write(i);

            }
            System.out.println("copy ok");

        } catch (FileNotFoundException e) {
            e.fillInStackTrace();
        }
    }
}

