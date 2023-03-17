package case_study.common;

import case_study.model.Employee;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFileEmployee {
    public static List<Employee> read(String path) {
        List<Employee> employeeList = new ArrayList<>();
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(path));
            String temp = "";
            Employee employee;
            String[] tempArr;
            while ((temp = bufferedReader.readLine()) != null) {
                tempArr = temp.split(",");
                employee = new Employee(tempArr[0], tempArr[1],tempArr[2],tempArr[3],tempArr[4],tempArr[5],tempArr[6],tempArr[7],tempArr[8],Double.parseDouble(tempArr[9]));
                employeeList.add(employee);
            }

            bufferedReader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return employeeList;
    }
}
