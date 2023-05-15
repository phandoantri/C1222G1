package repository;


import model.Customer;

import java.util.List;

public interface ICustomerRepository {
    List<Customer> getOn();
    void delete(int id);
    void save(Customer customer);
}
