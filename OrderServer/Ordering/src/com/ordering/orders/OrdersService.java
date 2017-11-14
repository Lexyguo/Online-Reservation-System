package com.ordering.orders;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.ordering.common.model.Orders;

public class OrdersService {
	public static final Orders dao = new Orders().dao();
	public void CreateOrderByTag(String tag){
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
		String ordertime=df.format(new Date());// new Date()为获取当前系统时间
		dao.set("ordertime", ordertime).set("","").save();
	}
	public void CreateOrderDetailByUserId(String users_id){
		
	}
	public List<Orders> FindByTag(String tag){
		return dao.find("SELECT * FROM orders where tag='"+tag+"'");
		//return find("SELECT * FROM user WHERE user = '"+name+"' AND passwd = '"+password+"'");
	}
	/*public void Add(){
		getModel(Cart.class).save();
	}*/
	public Orders findById(int id) {
		return dao.findById(id);
	}
	public void deleteById(int id) {
		dao.deleteById(id);
	}
}
