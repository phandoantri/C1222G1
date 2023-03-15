package case_study.common;

import case_study.model.Customer;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFileCustomer {
    public static List<Customer> read( String path){
        List<Customer> customerList=new ArrayList<>();
        BufferedReader bufferedReader=null;
        try {
            bufferedReader=new BufferedReader(new FileReader(path));
            String temp="";
            Customer customer;
            String[] tempArr;
            while ((temp=bufferedReader.readLine())!=null){
                tempArr=temp.split(",");
                customer=new Customer(tempArr[0],tempArr[1],tempArr[2],tempArr[3],tempArr[4],tempArr[5],tempArr[6],tempArr[7],tempArr[8]);
                customerList.add(customer);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return customerList;
    }
}
