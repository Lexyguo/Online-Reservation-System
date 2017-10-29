package com.ordering.entity;

public class User {
	private int user_id;
	private String username;
	private String password;
	private String department;
	private String tel;
	private double monetary;
	private int permisson;
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public double getMonetary() {
		return monetary;
	}
	public void setMonetary(double monetary) {
		this.monetary = monetary;
	}
	public int getPermisson() {
		return permisson;
	}
	public void setPermisson(int permisson) {
		this.permisson = permisson;
	}
	
}
