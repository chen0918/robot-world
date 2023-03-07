package com.example.service.impl;

import com.example.dao.UserDao;
import com.example.domain.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public void addUser(User user){
//        userDao.addUser(user);
        userDao.insert(user);
    };


    public void delUserById(int id){
//        userDao.delUserById(id);
        userDao.deleteById(id);
    };
    public void updateUser(int id, User user){
        user.id = id;
        userDao.updateById(user);
//        userDao.updateUser(id,user);
    };

    public List<User> getAllUsers(){
//        return userDao.getAllUsers();
        return userDao.selectList(null);
    };

    public User getUserById(int id){
        return userDao.selectById(id);
    };

}
