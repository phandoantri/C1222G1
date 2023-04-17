package service;

import model.User;

import java.util.List;

public interface IUserService {
    List<User> getOn();
    void save(User user);
    void delete(int id);
    List<User> findByCountry(String name);
    User findById(int id);
    void update(int id,User user);

}
