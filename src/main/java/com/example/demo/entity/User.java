package com.example.demo.entity;

import lombok.Data;
//import org.springframework.util.DigestUtils;

@Data
public class User {
    private Integer user_id;
    private String user_name;
    private String password;
    private String phone;
 
    public User(Integer user_id, String user_name, String password, String phone) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.password = password;
        this.phone = phone;
    }
 
    public Integer getId() {
        return user_id;
    }
 
    public void setId(Integer user_id) {
        this.user_id = user_id;
    }
 
    public String getName() {
        return user_name;
    }
 
    public void setName(String user_name) {
        this.user_name = user_name;
    }
 
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
    	this.password = password;
    }
 
    public String getPhone() {
        return phone;
    }
 
    public void setPhone(String phone) {
        this.phone = phone;
    }
 
    @Override
    public String toString() {
        return "User{" +
                "user_id=" + user_id +
                ", uesr_name='" + user_name + '\'' +
                ", phone=" + phone +
                '}';
    }
}