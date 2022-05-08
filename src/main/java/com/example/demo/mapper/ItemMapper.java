package com.example.demo.mapper;

import java.util.List;

import com.example.demo.entity.Item;
import com.example.demo.entity.User;

public interface ItemMapper {
	public void insertItem(Item item);
	public void deleteItem(Integer item_id);
	public Item selectItem(Integer item_id);
	public void updateItem(Item item);
	public List<Item> selectAll();
	public List<Item> selectExDate();

}
