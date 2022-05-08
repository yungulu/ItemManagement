	package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.util.DigestUtils;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.entity.Result;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import com.example.demo.service.UserServiceImpl;

import java.util.List;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
@ResponseBody
@RequestMapping(value = "/user")
//把这个bean 的范围设置成session，表示这bean是会话级别的，  
@Scope("session")  
public class UserController {
	@Autowired
	UserService userService;
	
	private List<String> list ;
	//@PostConstruct当bean加载完之后，就会执行init方法，并且将list实例化；  
    @PostConstruct  
    public void init(){  
        list = new ArrayList<String>();  
    }  

	@GetMapping("/toInsertUser")
	public ModelAndView toAddUser(){
        ModelAndView modelAndView = new ModelAndView("insertUserPage");
        return modelAndView;
    }
	
	@GetMapping("/toUpdateUser")
	public ModelAndView toUpdateUser(){
        ModelAndView modelAndView = new ModelAndView("updateUser");
        return modelAndView;
    }

	@PostMapping("/findById")
    public User findById(Integer user_id){
        return userService.selectUser(user_id);
    }
	
	@RequestMapping("select/{id}")
    @ResponseBody
    public String save(@PathVariable int user_id){
        return userService.selectUser(user_id).toString();
    }
	
	@PostMapping("/insert")
    public void insertUser(User user){
        userService.insertUser(user);
    }

	
	@GetMapping(value = "/userList")
    public ModelAndView userList(Model model){
		ModelAndView modelAndView = new ModelAndView("showUser");
        List<User> users = userService.findAll();
        modelAndView.addObject("users",users);
        return modelAndView;
    }
	
	@ResponseBody
    @RequestMapping(value = "/findAll")
    public List<User> findAll() {
        return userService.findAll();
    }
	
    @GetMapping("/toShowUser")
    public ModelAndView toShowUser(){
        ModelAndView modelAndView = new ModelAndView("showUser");
        return modelAndView;
    }
    
	@GetMapping("/toLogin")
	public ModelAndView toLogin(){
        ModelAndView modelAndView = new ModelAndView("login");
        return modelAndView;
    }
	
	
    /**
     * 登录
     * @param user 参数封装
     */
    @PostMapping(value = "/login")
    public Result<?> login(User user){
        return userService.login(user);
    }
    
  /***  
    @ResponseBody
    @RequestMapping(value = "/add")
    public int addUser(User u){
        User u = new User(18,"张三","123456abc","17877781234");
        int stat = userService.addUser(u);
        return stat;
    }
***/
}
