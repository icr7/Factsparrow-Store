package com.factsparrow.ecommerce.controller;

import com.factsparrow.ecommerce.model.User;
import com.factsparrow.ecommerce.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userServiceImpl;

    @GetMapping("/getAllUsers")
    public List<User>getAllUser(){
        return userServiceImpl.getAllUser();
    }

    @GetMapping("/getUser/{id}")
    public User getUserById(@PathVariable("id") int id){
        return userServiceImpl.getUserById(id);
    }

    @PostMapping(value = "/saveUser", consumes = {"application/xml","application/json"})
    public void saveUserDetail(@RequestBody User user){
        userServiceImpl.saveUser(user);
    }

    @PostMapping("/updateUser")
    public void updateUserDetail(@RequestBody User user){
        userServiceImpl.saveUser(user);
    }

    @DeleteMapping("/deleteUser/{id}")
    public void deleteUser(@PathVariable("id") int id){
        userServiceImpl.DeleteUser(id);
    }
}

