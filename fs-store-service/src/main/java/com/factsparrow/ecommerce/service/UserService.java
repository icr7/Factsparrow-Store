package com.factsparrow.ecommerce.service;

import com.factsparrow.ecommerce.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUser();
    User getUserById(int id);
    void saveUser(User user);
    void DeleteUser(int id);
}
