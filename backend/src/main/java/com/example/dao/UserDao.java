package com.example.dao;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.domain.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

//@Mapper
//public interface UserDao {
//
//    @Insert("insert into tb_user (username,password,gender,addr) values (#{username},#{password},#{gender},#{addr})")
//    @Options(useGeneratedKeys = true,keyProperty = "id",keyColumn = "id")
//    public void addUser(User user);
//
//    @Delete("delete from tb_user where id=#{id}")
//    public void delUserById(int id);
//
//
//    @Update({"<script> ",
//            "update tb_user ",
//            "set ",
//            "<if test=\"user.username!=null\">",
//            "username = #{user.username}",
//            "</if>",
//            "<if test=\"user.gender!=null\">",
//            ",gender = #{user.gender}",
//            "</if>",
//            "<if test=\"user.addr!=null\">",
//            ",addr = #{user.addr}",
//            "</if>",
//            "<if test=\"user.password!=null\">",
//            ",password = #{user.password}",
//            "</if>",
//            "where id=#{userId}",
//            "</script>"
//    }
//    )
//    public void updateUser(@Param("userId") int userId, @Param("user") User user);
//
//    @Select("select id,username,password,gender,addr from tb_user;")
//    public List<User> getAllUsers();
//
//    @Select("select id,username,password,gender,addr from  tb_user where id=#{id}")
//    public User getUserById(int id);
//
//
//}
@Mapper
public interface UserDao extends BaseMapper<User> {

}