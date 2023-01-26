package com.user.service.services;

import com.user.service.entities.User;

import java.util.List;

public interface UserService
{
    //user Operation define here
    //create user or save user
    User saveUser(User user);
    //get all user
    List<User> getAllUser();
    //get single user by given user id
    User getUser(String userId);
    //ToDo:Delete
    //ToDo:Update
}
