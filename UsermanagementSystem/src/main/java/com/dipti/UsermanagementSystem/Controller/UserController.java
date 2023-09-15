package com.dipti.UsermanagementSystem.Controller;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserController userService;


    @GetMapping(value = "users")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("users/search/{userId}")
    public User getUserByUserid(@PathVariable Integer userId) {
        return userService.getUserByUserid(userId);
    }

    @PostMapping("users") // add user
    public String addUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    private String createUser(User user) {
        return null;
    }

    @DeleteMapping("users/delete/{userId}")

    public String DeleteUserById(@PathVariable Integer userId) {

        return userService.DeleteUserById(userId);
    }

    @PutMapping("users/{userId}/{userContact}")
    public String UpdateUser(@PathVariable Integer userId, @PathVariable String userContact) {
        return userService.updateUserContact(userId, userContact);
    }

    private String updateUserContact(Integer userId, String userContact) {
        return null;
    }
}
