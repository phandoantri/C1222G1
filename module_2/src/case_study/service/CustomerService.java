package case_study.service;

import case_study.model.Customer;
import case_study.repository.CustomerRepository;

import java.util.List;
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
        System.out.println("enter id ");
        String id = sc.nextLine();
        System.out.println("enter name ");
        String name = sc.nextLine();
        System.out.println("enter day of birth ");
        String dayOfBirth = sc.nextLine();
        System.out.println("enter cmnd of number ");
        String cmndNumber = sc.nextLine();
        System.out.println("enter phone number ");
        String phoneNumber = sc.nextLine();
        System.out.println("enter email ");
        String email = sc.nextLine();
        System.out.println("enter type guest ");
        String typeOfGuest = sc.nextLine();
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
