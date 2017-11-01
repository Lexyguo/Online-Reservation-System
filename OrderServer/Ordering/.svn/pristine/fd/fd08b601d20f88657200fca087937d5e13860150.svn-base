package com.ordering.cart;

import com.jfinal.core.Controller;

public class CartController extends Controller{
	public String flag(){
		String vcode = "";
		for (int i = 0; i < 4; i++) {
			vcode = vcode + (int) (Math.random() * 9);
		}
		String tag=getSessionAttr("userid")+vcode;
		return tag;
	}
	//多人共享购物车
	public void multiplayer(){
		
	}
}
