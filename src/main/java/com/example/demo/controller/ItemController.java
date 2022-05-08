package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.util.DigestUtils;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

import com.example.demo.entity.Item;
import com.example.demo.entity.Result;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import com.example.demo.service.UserServiceImpl;
import com.example.demo.service.ItemService;
import com.example.demo.service.ItemServiceImpl;

import java.util.List;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
@ResponseBody
@RequestMapping(value = "/item")
public class ItemController {
	@Autowired
	ItemService itemService;
	
	@GetMapping("/toInsertItem")
	public ModelAndView toInsertItem(){
        ModelAndView modelAndView = new ModelAndView("itemAdd");
       // List<Item> items = itemService.findAll();
       // modelAndView.addObject("items",items);
        return modelAndView;
    }
	

	@PostMapping("/findById")
    public Item findById(Integer item_id){
        return itemService.selectItem(item_id);
    }
	/***
	@RequestMapping("select/{id}")
    @ResponseBody
    public String save(@PathVariable int item_id){
        return itemService.selectItem(item_id).toString();
    }
	***/
	@PostMapping("/insert")
    public void insertItem(Item item){
		itemService.insertItem(item);
    }

	@PostMapping("/selectItem")
    public void selectItem(Integer item_id){
		itemService.selectItem(item_id);
    }
	
	@GetMapping(value = "/showAItem")
    public ModelAndView showAItem(Model model){
		ModelAndView modelAndView = new ModelAndView("showAItem");
        return modelAndView;
    }
	
	@GetMapping(value = "/itemList")
    public ModelAndView itemList(Model model){
		ModelAndView modelAndView = new ModelAndView("showItem");
        List<Item> items = itemService.findAll();
        modelAndView.addObject("items",items);
        return modelAndView;
    }
	
	@GetMapping(value = "/itemExDate")
    public ModelAndView itemExDate(Model model){
		ModelAndView modelAndView = new ModelAndView("itemExDate");
        List<Item> itemEs = itemService.findAll();
        modelAndView.addObject("itemEs",itemEs);
        return modelAndView;
    }
	
	@GetMapping(value = "/expirationDateList")
    public ModelAndView expirationDate(Model model){
		ModelAndView modelAndView = new ModelAndView("expirationDate");
        List<Item> expirationDates = itemService.findAll();
        modelAndView.addObject("expirationDates",expirationDates);
        return modelAndView;
    }
	
	@ResponseBody
    @RequestMapping(value = "/findAll")
    public List<Item> findAll() {
        return itemService.findAll();
    }
	
    @GetMapping("/toShowItem")
    public ModelAndView toShowItem(){
        ModelAndView modelAndView = new ModelAndView("showItem");
        return modelAndView;
    }
    

}
