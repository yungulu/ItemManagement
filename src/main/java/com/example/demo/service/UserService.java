package com.example.demo.service;

import java.util.List;


import com.example.demo.entity.Result;
import com.example.demo.entity.User;

public interface UserService {
	
	public void insertUser(User user);
	void deleteUser(Integer user_id);
    User selectUser(Integer user_id);
    void updateUser(User user);
    List<User> findAll();
    public Result<?> login(User user);

}
