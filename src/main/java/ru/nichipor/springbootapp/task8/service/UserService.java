package ru.nichipor.springbootapp.task8.service;



import ru.nichipor.springbootapp.task8.model.User;

import java.util.List;

public interface UserService {
    void createUser(User user);

    User getUser(Long id);

    List<User> getAllUsers();

    void updateUser(User user, Long id);

    void deleteUser(Long id);
}
