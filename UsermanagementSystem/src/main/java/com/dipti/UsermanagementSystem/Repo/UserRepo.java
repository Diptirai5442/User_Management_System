package com.dipti.UsermanagementSystem.Repo;


import com.dipti.UsermanagementSystem.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepo {
    @Autowired
    private List<User> userList;
    public List<User> getUsers() {
        return userList;
    }


    public void delete(User user) {
        userList.remove(user);
    }
}