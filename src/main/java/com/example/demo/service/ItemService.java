package com.example.demo.service;

import java.util.List;

//import com.example.demo.entity.Result;
import com.example.demo.entity.Item;

public interface ItemService {
	public void insertItem(Item item);
	public void deleteItem(Integer item_id);
	public Item selectItem(Integer item_id);
	public void updateItem(Item item);
    public List<Item> findAll();
    public List<Item> findExDate();
}
