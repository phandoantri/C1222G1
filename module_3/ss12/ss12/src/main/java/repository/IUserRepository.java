package repository;

import model.User;

import java.util.List;

public interface IUserRepository {
    List<User> getOn();
    void save(User user);
    void delete(int id);
}
