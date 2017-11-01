package com.ordering.index;

import java.util.List;


import com.jfinal.core.Controller;
import com.ordering.cart.CartService;
import com.ordering.common.model.Cart;

public class IndexController extends Controller{
	static CartService cartservice = new CartService();
	public void index() {
		render("test.html");
		System.out.println("xxxxxxxxx");
		System.out.println("findbyid:"+cartservice.findById(1));
		System.out.println(cartservice.FindByTag("12345"));
		List<Cart> carts=cartservice.FindByTag("12345");
		System.out.println("size"+carts.size());
		for(int i=0;i<carts.size();i++){
			System.out.println("i:"+carts.get(i));
			System.out.println("userid:"+carts.get(i).get("user_id"));
			System.out.println("dishesid:"+carts.get(i).get("dishes_id"));
			System.out.println("num:"+carts.get(i).get("num"));
	}
	}
}
