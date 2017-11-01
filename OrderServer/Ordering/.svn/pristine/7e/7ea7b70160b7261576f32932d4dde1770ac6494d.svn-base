package com.ordering.User;

import java.util.Date;
import java.util.List;

import com.jfinal.core.Controller;
import com.ordering.cart.CartService;
import com.ordering.common.model.User;

import api.DefaultApi;
import wxlink.ApiException;

public class UserController extends Controller {
	//private static final String RANDOM_CODE_KEY = "1";
	private static UserService userservice = new UserService();
	private static Date now;
	private String ow;
	public void index() {		
		System.out.println(getSessionAttr("userid").toString());
		if(getSessionAttr("userid")==null){
			redirect("/");
		}
	}
	public void login() {
		List<User> users = userservice.FindByUserIdAndPasswd(getPara("user_id"), getPara("password"));	
		if(users.size()>0){
		setSessionAttr("userinfo", users.get(0));
		//System.out.println(getModel(User.class).getInt("id")+"id");
		setSessionAttr("user_id",getPara("user_id"));
		//System.out.println(users.get(0).get("id"));
		//System.out.println(getSessionAttr("userinfo"));
		redirect("/user/index");
		} else{
			redirect("/");
		}
	}
	public void main() {
		if(getSessionAttr("userid")==null){
			redirect("/");
		}
	}
	
	public void info() {
		if(getSessionAttr("userid")==null){
			redirect("/");
		}
		setAttr("user_id", userservice.findById(getSessionAttr("userid")));		
	}
	public void info1() {
		//setAttr("user", getSessionAttr("userinfo"));
		if(getSessionAttr("user_id")==null){
			redirect("/");
		}
		else{
			getModel(User.class).update();
			renderText("修改成功");
		}
	}
	public void register() {			
		
	}
	public void code(){
		String mobile =getPara("tel");
		DefaultApi apiInstance = new DefaultApi();
		ow = createRandomVcode();
		String content = "您正在进行手机验证，验证码为：" + ow + ",5分钟内有效"; // String
																	// |
																	// 短信的内容，内容需要UTF-8编码
		String appkey = "cd8d624333fe82952556f035eb47961c"; // String |															// 万象平台提供的appkey		
		try {
			String result = apiInstance.dxjk(mobile, content, appkey);
			now = new Date();
			System.out.println("now:" + now);
			System.out.println(result);
		} catch (ApiException e) {
			System.err.println("Exception when calling DefaultApi#VerCodesms");
			e.printStackTrace();
		}
	}
	//@Before(UserValidator.class)
	public void register1() {//注册	
		String codes=getPara("code");
		Date date = new Date();
		long interval = (date.getTime() - now.getTime()) / 1000 / 60;
		if (ow.equals(codes) && interval < 5) {
			User user=getModel(User.class);
			user.save();
		}
		
		/*int userid=user.getInt("id");	
		
		String sub[]=getParaValues("subjects.projects");
		for(int i=0;i<sub.length;i++){
			Subjects.me.set("userid", userid).set("projects",sub[i]).save();
			System.out.println(sub[i]);*/		
		redirect("/");
	}
	
	public void changepasswd() {
		if(getSessionAttr("userid")==null){
			redirect("/");
		}
		else{
		setAttr("user", userservice.findById(getSessionAttr("userid")));
		}
		//render("changepasswd.html");
	}	
	public void update() {//修改密码
		if(getSessionAttr("userid")==null){
			redirect("/");
		}
		else{
		getModel(User.class).update();
		renderText("修改成功");
		}
		//redirect("/user/login");
	}
	public static String createRandomVcode() {
		// 验证码
		String vcode = "";
		for (int i = 0; i < 6; i++) {
			vcode = vcode + (int) (Math.random() * 9);
		}
		return vcode;
	}
	
}
