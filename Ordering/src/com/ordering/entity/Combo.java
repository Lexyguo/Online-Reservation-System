package com.ordering.entity;

public class Combo {
	private int combo_id;
	private String combo_name;
	private int dishes;
	private int order_num;
	private int bookings;
	
	public int getCombo_id() {
		return combo_id;
	}
	public void setCombo_id(int combo_id) {
		this.combo_id = combo_id;
	}
	public String getCombo_name() {
		return combo_name;
	}
	public void setCombo_name(String combo_name) {
		this.combo_name = combo_name;
	}
	public int getDishes() {
		return dishes;
	}
	public void setDishes(int dishes) {
		this.dishes = dishes;
	}
	public int getOrder_num() {
		return order_num;
	}
	public void setOrder_num(int order_num) {
		this.order_num = order_num;
	}
	public int getBookings() {
		return bookings;
	}
	public void setBookings(int bookings) {
		this.bookings = bookings;
	}
	
}
