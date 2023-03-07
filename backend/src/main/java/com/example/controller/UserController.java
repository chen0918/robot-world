package com.example.controller;

import com.example.domain.User;
import com.example.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserServiceImpl userServiceImpl;

    @GetMapping("/{id}")
    @ResponseBody
    public Result getUserById(@PathVariable int id) {

        User user = userServiceImpl.getUserById(id);
        return new Result(Code.GET_OK, user);
    }
    @GetMapping("/")
    @ResponseBody
    public Result getUsers() {
//        int o = 1 / 0;
        List<User> allUsers = userServiceImpl.getAllUsers();
        return new Result(Code.GET_OK, allUsers);
    }

    @PostMapping("/")
    @ResponseBody
    public Result addUser(@RequestBody User user) {
        userServiceImpl.addUser(user);
        return new Result(Code.SAVE_OK,user);
    }

    @PutMapping("/{id}")
    @ResponseBody
    public Result updateUser(@PathVariable int id, @RequestBody User user) {
        userServiceImpl.updateUser(id,user);
        return new Result(Code.UPDATE_OK);
    }
    @DeleteMapping("/{id}")
    @ResponseBody
    public Result delUser(@PathVariable int id) {
        userServiceImpl.delUserById(id);
        return new Result(Code.DELETE_OK);
    }
}
