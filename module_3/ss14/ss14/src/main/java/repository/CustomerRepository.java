package repository;


import model.Customer;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CustomerRepository implements ICustomerRepository {
    public static final String SQL_SHOW_CUSTOMER = "select c.id_customer,c.name_customer,c.day_of_birth,c.gender,tc.name_type_customer  from customer c join type_customer tc on c.id_type_customer = tc.id_type_customer";
    public static final String SQL_DELETE_CUSTOMER = "delete from customer where id_customer=?;";
    public static final String SQL_SELECT_CUSTOMER="insert into customer values (?,?,?,?,?);";

    @Override
    public List<Customer> getOn() {
        List<Customer> customerList = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = BaseRepository.getConnection().prepareStatement(SQL_SHOW_CUSTOMER);
            ResultSet resultSet = preparedStatement.executeQuery();
            Customer customer;
            while (resultSet.next()) {
                int id=resultSet.getInt("id_customer");
                String name = resultSet.getString("name_customer");
                Date dayOfBirth = resultSet.getDate("day_of_birth");
                boolean gender = resultSet.getBoolean("gender");
                String name_type_customer = resultSet.getString("name_type_customer");
                customer = new Customer(id,name, dayOfBirth, gender, name_type_customer);
                customerList.add(customer);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customerList;
    }

    @Override
    public void delete(int id) {
        try {
            PreparedStatement preparedStatement = BaseRepository.getConnection().prepareStatement(SQL_DELETE_CUSTOMER);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void save(Customer customer) {
        try {
            PreparedStatement preparedStatement=BaseRepository.getConnection().prepareStatement(SQL_SELECT_CUSTOMER);
            preparedStatement.setInt(1,customer.getIdCustomer());
            preparedStatement.setString(2,customer.getNameCustomer());
            preparedStatement.setDate(3, (java.sql.Date) customer.getDayOfBirth());
            preparedStatement.setBoolean(4,customer.isGender());
            preparedStatement.setInt(5,customer.getIdTypeCustomer());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
