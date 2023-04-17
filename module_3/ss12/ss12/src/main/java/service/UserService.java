package service;

import model.User;
import repository.IUserRepository;
import repository.UserRepository;

import java.util.List;

public class UserService implements IUserService{
    private IUserRepository iUserRepository=new UserRepository();
    @Override
    public List<User> getOn() {
        return iUserRepository.getOn();
    }

    @Override
    public void save(User user) {
        iUserRepository.save(user);
    }

    @Override
    public void delete(int id) {
        iUserRepository.delete(id);
    }

    @Override
    public List<User> findByCountry(String name) {
        return iUserRepository.findByCountry(name);
    }

    @Override
    public User findById(int id) {
      User user=iUserRepository.findById(id);
      return user;
    }

    @Override
    public void update(int id, User user) {
        iUserRepository.update(id,user);
    }
}
