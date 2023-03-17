package case_study.service;

import case_study.model.Customer;
import case_study.repository.CustomerRepository;
import case_study.until.CheckDayOfBirth;
import case_study.until.CheckEmail;
import case_study.until.CheckNamePeople;
import case_study.until.CheckPhoneNumber;

import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class CustomerService implements ICustomerService {
    Scanner sc = new Scanner(System.in);
    CustomerRepository customerRepository = new CustomerRepository();

    @Override
    public void display() {
        List<Customer> customerList = customerRepository.display();
        for (Customer customer : customerList) {
            System.out.println(customer);
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
        while (!CheckDayOfBirth.checkDayOfBirth(dayOfBirth)){
            System.out.println("day of birth is xx-xx-xxxx");
            System.out.println("enter again ");
            dayOfBirth=sc.nextLine();
        }
        System.out.println("enter cmnd of number ");
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
        System.out.println("enter type guest ");
        String typeOfGuest;
        do {

            System.out.println("choice type guest\n"+
                    "1.diamond guest\n"+
                    "2.gold guest\n"+
                    "3.silver guest\n"+
                    "4.member");
            typeOfGuest = sc.nextLine();

        }while ((!typeOfGuest.equals("1")) && (!typeOfGuest.equals("2"))&&(!typeOfGuest.equals("3"))&&(!typeOfGuest.equals("4")));
        switch (typeOfGuest){
            case "1":
                typeOfGuest="diamond guest";

                break;
            case "2":
                typeOfGuest="gold guest ";
                break;
            case "3":
                typeOfGuest="silver guest";
                break;
            case "4":
                typeOfGuest="member";
                break;
        }
        System.out.println("enter address ");
        String address = sc.nextLine();
        Customer customer = new Customer(gender, id, name, dayOfBirth, cmndNumber, phoneNumber, email, typeOfGuest, address);
        customerRepository.add(customer);
    }

//    @Override
//    public void edit(String name) {
//customerRepository.edit(name)
//    }
}
