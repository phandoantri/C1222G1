package case_study.service;

import case_study.model.Employee;
import case_study.repository.EmployeeRepository;
import case_study.until.CheckEmail;
import case_study.until.CheckNamePeople;
import case_study.until.CheckPhoneNumber;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.ArrayList;
import java.util.Date;
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
        while (!gender.equals("male")&&!gender.equals("female")&&!gender.equals("other gender ")){
            System.out.println("gender must be male or female or other gender ");
            System.out.println("enter again ");
            gender=sc.nextLine();
        }
        System.out.println("enter id ");
        String id = sc.nextLine();
        System.out.println("enter name ");
        String name = sc.nextLine();
        while (!CheckNamePeople.checkNamePeople(name)){
            System.out.println("name people is Xxxx Xxxx");
            System.out.println("enter again ");
            name=sc.nextLine();
        }
        System.out.println("enter day of birth ");
        String dayOfBirth = sc.nextLine();

        System.out.println("enter cnmdNumber ");
        String cmndNumber = sc.nextLine();
        System.out.println("enter phone number ");
        String phoneNumber = sc.nextLine();
        while (!CheckPhoneNumber.checkPhoneNumber(phoneNumber)){
            System.out.println("phone number is XX-0XXXXXXXXX");
            System.out.println("enter again ");
            phoneNumber=sc.nextLine();
        }
        System.out.println("enter email ");
        String email = sc.nextLine();
        while (!CheckEmail.checkEmail(email)){
            System.out.println("email must be xxx@xxxx.xxx");
            System.out.println("enter again ");
            email=sc.nextLine();
        }
        System.out.println("enter level ");
        String level = sc.nextLine();
        System.out.println("enter position");
        String position = sc.nextLine();
        System.out.println("enter salary ");
        double salary = Double.parseDouble(sc.nextLine());
        while (salary < 0) {
            System.out.println("rant cost must be greater than 0 ");
            System.out.println("enter again ");
            salary = Double.parseDouble(sc.nextLine());
        }
        Employee employee = new Employee(gender, id, name, dayOfBirth, cmndNumber, phoneNumber, email, level, position, salary);
        employeeRepository.add(employee);

    }


    @Override
    public void edit(String name) {
        employeeRepository.edit(name);
    }


}
