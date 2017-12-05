package com.ordering.manager;

import java.util.List;

import com.ordering.common.model.Manager;
import com.ordering.common.model.User;

public class MangerService {
	public static final Manager dao = new Manager().dao();
	public List<Manager> FindByUsernameAndPasswd(String username,String password){
		System.out.println(username+"|"+password);
		return dao.find("SELECT * FROM manager WHERE username = '"+username+"' AND password = '"+password+"'");
		//return find("SELECT * FROM user WHERE user = '"+name+"' AND passwd = '"+password+"'");
	}
}
