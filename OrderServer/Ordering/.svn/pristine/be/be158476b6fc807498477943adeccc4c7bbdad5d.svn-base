package com.ordering.User;

import java.util.List;

import com.ordering.common.model.User;

public class UserService {
	public static final User dao = new User().dao();
	public List<User> FindByUserIdAndPasswd(String user_id,String password){
		return dao.find("SELECT * FROM USER  WHERE user_id = '"+user_id+"' AND password = '"+password+"'");
		//return find("SELECT * FROM user WHERE user = '"+name+"' AND passwd = '"+password+"'");
	}
	public User findById(int id) {
		return dao.findById(id);
	}
	/*public void Add(){
		getModel(User.class).save();
	}*/
	public void deleteById(int id) {
		dao.deleteById(id);
	}
}
