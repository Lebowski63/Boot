package com.example.Boot1.dao;


import com.example.Boot1.model.User;

import java.util.List;

public interface UserDao {

    List<User> getAllUsers();
    User getById(Long id);
    void save(User user);

    void update(Long id, User userUpdate);
    void delete(Long id);
}
