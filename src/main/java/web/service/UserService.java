package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    public List<User> getUsers();

    public void saveUser( User theUser);

    public User getUser(int theId);

    public void deleteUser(int theId);
}
