package com.example.demo.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Result;
import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;

import java.util.List;
 
@Service
public class UserServiceImpl implements UserService {
	@Autowired
    private UserMapper userMapper; 
 
    @Override
    public void insertUser(User user) {
        userMapper.insertUser(user);
    }
 
    @Override
    public void deleteUser(Integer user_id) {
         userMapper.deleteUser(user_id);
    }
 
    @Override
    public User selectUser(Integer user_id) {
        return userMapper.selectUser(user_id);
    }
 
    @Override
    public List<User> findAll() {
        return userMapper.selectAll();
    }
 
    @Override
    public void updateUser(User user) {
         userMapper.updateUser(user);
    }
    
    /**
     * 登录
     * @param user 用户名和密码
     * @return Result
     */
    @Override
    public Result<?> login(User user) {
        Result<User> result = new Result<User>();
        result.setSuccess(false);
        result.setDetail(null);
        try {
        	Integer user_id= userMapper.login(user);
            if(user_id == null){
                result.setMsg("用户名或密码错误");
            }else{
                result.setMsg("登录成功");
                result.setSuccess(true);
                user.setId(user_id);
                result.setDetail(user);
                System.out.print(result.getDetail());
            }
        } catch (Exception e) {
            result.setMsg(e.getMessage());
            e.printStackTrace();
        }
        return result;
    }

}
