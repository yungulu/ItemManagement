package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Item;
import com.example.demo.entity.Result;
import com.example.demo.entity.User;
import com.example.demo.mapper.ItemMapper;
@Service
public class TaskService {
	@Autowired
    private ItemMapper itemMapper;
	
	public Result<?> selectDate(Item item) {
		Result<Item> result = new Result<Item>();
		itemMapper.selectExDate();
		return result;
	}
}
