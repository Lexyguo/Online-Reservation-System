package com.ordering.cart;

import java.util.List;

import com.ordering.common.model.Cart;

public class CartService {
	public static final Cart dao = new Cart().dao();
	public List<Cart> FindByTag(String tag){
		return dao.find("SELECT * FROM cart where tag='"+tag+"'");
		//return find("SELECT * FROM user WHERE user = '"+name+"' AND passwd = '"+password+"'");
	}
	public Cart findById(int id) {
		return dao.findById(id);
	}
}
