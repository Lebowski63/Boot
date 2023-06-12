package com.example.Boot1.dao;

import com.example.Boot1.model.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;


import java.util.List;
@Repository
public class UserDaoImp implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<User> getAllUsers() {
        return entityManager.createQuery("SELECT user FROM User user", User.class).getResultList();
    }

    @Override
    public User getById(Long id) {
        return entityManager.find(User.class, id);
    }

    @Override
    public void save(User user) {
        entityManager.persist(user);
    }

    @Override
    public void update(Long id, User userUpdate) {
        entityManager.merge(userUpdate);
    }

    @Override
    public void delete(Long id) {
        entityManager.createQuery("DELETE FROM User u WHERE u.id = :id ").setParameter("id", id).executeUpdate();
    }


}
