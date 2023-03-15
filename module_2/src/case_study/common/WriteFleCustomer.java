package case_study.common;

import case_study.model.Customer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFleCustomer {

    public static void write(String path, Customer customer){
        BufferedWriter bufferedWriter=null;
        try {
            bufferedWriter=new BufferedWriter(new FileWriter(path,true));
            bufferedWriter.write(customer.toString());
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.fillInStackTrace();
        }

    }

}
