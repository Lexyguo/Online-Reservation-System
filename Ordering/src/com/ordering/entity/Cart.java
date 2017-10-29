package com.ordering.entity;

public class Cart {
	private int user_id;
	private int dishes_id;
	private int num;
	private String tag;
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public int getDishes_id() {
		return dishes_id;
	}
	public void setDishes_id(int dishes_id) {
		this.dishes_id = dishes_id;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	
}
