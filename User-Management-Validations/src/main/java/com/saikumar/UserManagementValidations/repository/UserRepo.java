package com.saikumar.UserManagementValidations.repository;

import com.saikumar.UserManagementValidations.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepo {
    @Autowired
    List<User> userList;
    public List<User> getUserList(){
        return userList;
    }
}
