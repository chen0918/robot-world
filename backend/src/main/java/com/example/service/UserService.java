package com.example.service;


import com.example.domain.User;

import java.util.List;

public interface UserService {
    public void addUser(User user);

    public void delUserById(int id);


    public void updateUser(int id, User user);

    public List<User> getAllUsers();

    public User getUserById(int id);
}
