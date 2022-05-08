package com.example.demo.mapper;

import java.util.List;

//import com.example.demo.entity.Result;
import com.example.demo.entity.User;

public interface UserMapper {
	void insertUser(User user);
    void deleteUser(Integer user_id);
    User selectUser(Integer user_id);
    void updateUser(User user);
    List<User> selectAll();
    Integer login(User user);

}
