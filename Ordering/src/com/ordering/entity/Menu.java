package com.ordering.entity;

public class Menu {
	private int dishes_id;
	private String dishes_name;
	private double price;
	private int bookings;
	public int getDishes_id() {
		return dishes_id;
	}
	public void setDishes_id(int dishes_id) {
		this.dishes_id = dishes_id;
	}
	public String getDishes_name() {
		return dishes_name;
	}
	public void setDishes_name(String dishes_name) {
		this.dishes_name = dishes_name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getBookings() {
		return bookings;
	}
	public void setBookings(int bookings) {
		this.bookings = bookings;
	}
	
}
