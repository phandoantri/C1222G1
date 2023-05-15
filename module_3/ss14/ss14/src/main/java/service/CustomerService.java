package service;
import model.Customer;
import repository.CustomerRepository;
import repository.ICustomerRepository;

import java.util.List;

public class CustomerService implements ICustomerService{
   private ICustomerRepository iCustomerRepository=new CustomerRepository();
    @Override
    public List<Customer> getOn() {
        return iCustomerRepository.getOn();
    }

    @Override
    public void delete(int id) {
        iCustomerRepository.delete(id);
    }

    @Override
    public void save(Customer customer) {
        iCustomerRepository.save(customer);
    }
}
