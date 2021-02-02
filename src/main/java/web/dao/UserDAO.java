package web.dao;

import web.model.User;

import java.util.List;

public interface UserDAO {

    public List<User> getUsers();

    public void saveUser(User theCustomer);

    public User getUser(int theId);

    public void deleteUser(int theId);



}
