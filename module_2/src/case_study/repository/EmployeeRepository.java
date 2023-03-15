package case_study.repository;

import case_study.common.ReadFileEmployee;
import case_study.common.WriteFileEmployee;
import case_study.model.Employee;

import java.util.List;
import java.util.Scanner;

public class EmployeeRepository implements IEmployeeRepository {
    public static final String PATH="src/case_study/data/employee_txt";
    static  List<Employee> employeeList=ReadFileEmployee.read(PATH);


    Scanner sc=new Scanner(System.in);



    @Override
    public List<Employee> display() {
       return ReadFileEmployee.read(PATH);

    }

    @Override
    public void add(Employee employee) {
        WriteFileEmployee.write(PATH,employee);

    }

    @Override
    public void edit(String name) {
        employeeList = ReadFileEmployee.read(PATH);
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getName().equals(name)){
                System.out.println("enter gender ");
                String gender=sc.nextLine();
                System.out.println("enter id ");
                String id=sc.nextLine();
                System.out.println("enter name ");
                String names=sc.nextLine();
                System.out.println("enter day of birth ");
                String dayOfBirth=sc.nextLine();
                System.out.println("enter cnmdNumber ");
                String cmndNumber=sc.nextLine();
                System.out.println("enter phone number ");
                String phoneNumber=sc.nextLine();
                System.out.println("enter email ");
                String email=sc.nextLine();
                System.out.println("enter level ");
                String level=sc.nextLine();
                System.out.println("enter position");
                String position=sc.nextLine();
                System.out.println("enter salary ");
                String salary=sc.nextLine();
                employeeList.get(i).setGender(gender);
                employeeList.get(i).setId(id);
                employeeList.get(i).setName(names);
                employeeList.get(i).setDayOfBirth(dayOfBirth);
                employeeList.get(i).setCmndOfNumber(cmndNumber);
                employeeList.get(i).setPhoneNumber(phoneNumber);
                employeeList.get(i).setEmail(email);
                employeeList.get(i).setLevel(level);
                employeeList.get(i).setPosition(position);
                employeeList.get(i).setSalary(salary);
                WriteFileEmployee.writeList(PATH,employeeList);
                break;
            }
        }
    }
}
