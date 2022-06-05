package com.factsparrow.ecommerce.service.impl;

import com.factsparrow.ecommerce.dao.UserRepository;
import com.factsparrow.ecommerce.model.User;
import com.factsparrow.ecommerce.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(int id) {
        return userRepository.findByUserId(id);
    }

    @Override
    public void saveUser(User user) {
      userRepository.save(user);
    }

    @Override
    public void DeleteUser(int id) {
      userRepository.deleteById(id);
    }
}
