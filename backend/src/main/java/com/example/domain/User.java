package com.example.domain;

import com.baomidou.mybatisplus.annotation.TableName;


@TableName("tb_user")
public class User {
    public Integer id;
    public String username;
    public String password;
    public String gender;
    public String addr;


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", gender='" + gender + '\'' +
                ", addr='" + addr + '\'' +
                '}';
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public void save(){
        System.out.println("Hello World");
    }
}
