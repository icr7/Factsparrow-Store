package com.factsparrow.ecommerce.dao;

import com.factsparrow.ecommerce.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
    public User findByUserId(Integer userId);
}
