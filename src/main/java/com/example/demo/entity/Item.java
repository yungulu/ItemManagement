package com.example.demo.entity;

import java.util.Date;

import lombok.Data;


public class Item {
	private Integer item_id;
	private String item_name;
    private String item_sp_place;//物品的具体位置
    private Integer item_num;//物品数量
    private String expiration_date;//到期时间
    private String item_tag;//物品标签
    private String remark;//备注
    private Integer user_id;//用户Id
    private Integer room_id;
    private Integer building_id;
	
    public Integer getItem_id() {
		return item_id;
	}

	public void setItem_id(Integer item_id) {
		this.item_id = item_id;
	}

	public String getItem_name() {
		return item_name;
	}

	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}

	public String getItem_sp_place() {
		return item_sp_place;
	}

	public void setItem_sp_place(String item_sp_place) {
		this.item_sp_place = item_sp_place;
	}

	public Integer getItem_num() {
		return item_num;
	}

	public void setItem_num(Integer item_num) {
		this.item_num = item_num;
	}

	public String getExpiration_date() {
		return expiration_date;
	}

	public void setExpiration_date(String expiration_date) {
		this.expiration_date = expiration_date;
	}

	public String getItem_tag() {
		return item_tag;
	}

	public void setItem_tag(String item_tag) {
		this.item_tag = item_tag;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	public Integer getRoom_id() {
		return room_id;
	}

	public void setRoom_id(Integer room_id) {
		this.room_id = room_id;
	}

	public Integer getBuilding_id() {
		return building_id;
	}

	public void setBuilding_id(Integer building_id) {
		this.building_id = building_id;
	}
    
    public Item(Integer item_id,String item_name,String item_sp_place,Integer item_num,String expiration_date,String item_tag,String remark,Integer user_id,Integer room_id,Integer building_id) {
    	this.item_id = item_id;
    	this.item_name = item_name;
    	this.item_sp_place = item_sp_place;
    	this.item_num = item_num;
    	this.expiration_date = expiration_date;
    	this.item_tag = item_tag;
    	this.remark = remark;
    	this.user_id = user_id;
    	this.room_id = room_id;
    	this.building_id = building_id;
    }
    
    @Override
    public String toString() {
        return "Item{" +
                "item_id=" + item_id +
                ", item_name='" + item_name + '\'' +
                ", item_num=" + item_num +
                '}';
    }
}
