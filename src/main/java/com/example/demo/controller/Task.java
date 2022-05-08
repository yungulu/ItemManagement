package com.example.demo.controller;

import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Result;
import com.example.demo.service.ItemService;
import com.example.demo.service.TaskService;

/**
 * 定时任务的使用
 **/
@Component //注入到容器
public class Task{
	//@Autowired
	//TaskService taskService; 
	
   // @Scheduled(cron="0 0 0 * * ? ")   //每天0点执行一次
   // public void execute(){
      //  SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); //设置日期格式
        //taskService.selectDate();         
    //}
}