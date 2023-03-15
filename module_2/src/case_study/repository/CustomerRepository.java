package case_study.repository;

import case_study.common.ReadFileCustomer;
import case_study.common.WriteFleCustomer;
import case_study.model.Customer;
import case_study.model.Employee;

import java.util.List;

public class CustomerRepository implements ICustomerRepository {
    public static final String PATH = "src/case_study/data/customer_txt";
    List<Customer> customerList=ReadFileCustomer.read(PATH);


    @Override
    public List<Customer> display() {
        return ReadFileCustomer.read(PATH);
    }

    @Override
    public void add(Customer customer) {
        WriteFleCustomer.write(PATH,customer);
    }
}