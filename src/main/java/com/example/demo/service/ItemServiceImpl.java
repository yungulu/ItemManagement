package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Item;
import com.example.demo.mapper.ItemMapper;

@Service
public class ItemServiceImpl implements ItemService  {
	@Autowired
    private ItemMapper itemMapper;
	
	@Override
	public void insertItem(Item item) {
		itemMapper.insertItem(item);
	};
	
	@Override
	public void deleteItem(Integer item_id){
		itemMapper.deleteItem(item_id);
	};
	
	@Override
	public Item selectItem(Integer item_id){
		return itemMapper.selectItem(item_id);
	
	};
    
    @Override
    public void updateItem(Item item){
    	itemMapper.updateItem(item);
    };
    
    @Override
    public List<Item> findAll(){
    	return itemMapper.selectAll();
    };
    
    @Override
    public List<Item> findExDate(){
    	return itemMapper.selectExDate();   	
    };

}
