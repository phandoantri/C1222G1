package service;



import model.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> getOn();
    void delete(int id);
    void save(Customer customer);
}
