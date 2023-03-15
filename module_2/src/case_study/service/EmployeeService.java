package case_study.service;

import case_study.model.Employee;
import case_study.repository.EmployeeRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService {

    private EmployeeRepository employeeRepository = new EmployeeRepository();
    Scanner sc = new Scanner(System.in);
    @Override
    public void display() {
        List<Employee> employeeList = employeeRepository.display();
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }

    }


    @Override
    public void add() {
        System.out.println("enter gender ");
        String gender = sc.nextLine();
        System.out.println("enter id ");
        String id = sc.nextLine();
        System.out.println("enter name ");
        String name = sc.nextLine();
        System.out.println("enter day of birth ");
        String dayOfBirth = sc.nextLine();
        System.out.println("enter cnmdNumber ");
        String cmndNumber = sc.nextLine();
        System.out.println("enter phone number ");
        String phoneNumber = sc.nextLine();
        System.out.println("enter email ");
        String email = sc.nextLine();
        System.out.println("enter level ");
        String level = sc.nextLine();
        System.out.println("enter position");
        String position = sc.nextLine();
        System.out.println("enter salary ");
        String salary = sc.nextLine();
        Employee employee = new Employee(gender, id, name, dayOfBirth, cmndNumber, phoneNumber, email, level, position, salary);
        employeeRepository.add(employee);

    }


    @Override
    public void edit(String name) {
        employeeRepository.edit(name);
    }


}
