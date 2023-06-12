package com.example.Boot1.service;


import com.example.Boot1.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    User getById(Long id);
    void save(User user);
    void update(Long id, User userUpdate);
    void delete(Long id);

}
