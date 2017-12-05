package com.ordering.User;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.jfinal.core.Controller;
import com.ordering.cart.CartService;
import com.ordering.common.model.User;

import api.DefaultApi;
import wxlink.ApiException;

public class UserController extends Controller {
	//private static final String RANDOM_CODE_KEY = "1";
	public static Map<String, ArrayList<String>> register_map=new HashMap();
	public static Map<String, ArrayList<String>> login_map=new HashMap();
	private static UserService userservice = new UserService();


	int x;
	/*public void index() {		
		System.out.println(getSessionAttr("userid").toString());
		if(getSessionAttr("userid")==null){
			redirect("/");
		}
	}*/
	public void login() {
		System.out.println(1111);
		System.out.println(getPara("txtUser"));
		System.out.println(getPara("txtPwd"));
		String str = getPara("txtUser");
		/*if (str.equals("1")){
			renderText("true");
		}*/
		List<User> users = userservice.FindByUserIdAndPasswd(getPara("txtUser"), getPara("txtPwd"));	
		/*User user=userservice.findById(Integer.parseInt(getPara("txtUser")));
		if(user.getPassword().equals(getPara("txtPwd"))){
			renderText("true");
		}*/
		if(users.size()>0){
		//setSessionAttr("user_id",getPara("user_id"));
		renderText("true");
		//System.out.println(users.get(0).get("id"));
		System.out.println("ture");
		} /*else{
			renderText("false");
			System.out.println("false");
		}*/
	}
	public void tellogin() {
		renderNull();
		System.out.println(222);
		System.out.println(getPara("tel"));
		System.out.println(getPara("code"));
		List<User> users = userservice.findByTel(getPara("tel"));
		if(users.size()>0){
			System.out.println(login_map.size());
			String login_code=login_map.get(getPara("tel")).get(0);
			String login_sendtime=login_map.get(getPara("tel")).get(1);
			System.out.println("ow"+login_code);
			System.out.println(login_map.get(getPara("tel")));
			System.out.println("sendtime:"+login_sendtime);
			Date date = new Date();
			long interval =(new Date(login_map.get(getPara("tel")).get(1)).getTime()-date.getTime()  ) / 1000 / 60;
			
			System.out.println(interval*60*1000);
			if(login_code!=null){
				if(login_code.equals(getPara("code"))&&interval<5){
					renderText("true");
					System.out.println("ture");
				}
				else{
					renderText("false");
				}
			}			
		} else{
			renderText("false");
			System.out.println("false");
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
		User user=getModel(User.class);
		user.save();
		renderText("true");
	}
	public void login_code(){
		ArrayList<String> arraylist=new ArrayList<>();
		String mobile =getPara("tel");
		DefaultApi apiInstance = new DefaultApi();
		String ow = createRandomVcode();
		arraylist.add(ow);
		System.out.println(ow);
		
		String content = "【蜂窝网络】您正在进行手机验证，验证码为：" + ow + ",5分钟内有效"; // String
																	// |
																	// 短信的内容，内容需要UTF-8编码
		String appkey = "cd8d624333fe82952556f035eb47961c"; // String |															// 万象平台提供的appkey		
		try {
			String result = apiInstance.dxjk(mobile, content, appkey);
			Date now = new Date();
			System.out.println("now:" + now);
			arraylist.add(now.toString());
			login_map.put(mobile, arraylist);
			System.out.println(login_map.get(mobile));
			System.out.println(result);
			renderText("true");
		} catch (ApiException e) {
			System.err.println("Exception when calling DefaultApi#VerCodesms");
			e.printStackTrace();
		}
	}
	public void register_code(){
		ArrayList<String> arraylist=new ArrayList<>();
		x=2;
		System.out.println(x);
		String mobile =getPara("tel");
		DefaultApi apiInstance = new DefaultApi();
		String ow = createRandomVcode();
		arraylist.add(ow);
		System.out.println(ow);
		
		String content = "【蜂窝网络】您正在进行手机验证，验证码为：" + ow + ",5分钟内有效"; // String
																	// |
																	// 短信的内容，内容需要UTF-8编码
		String appkey = "cd8d624333fe82952556f035eb47961c"; // String |															// 万象平台提供的appkey		
		try {
			String result = apiInstance.dxjk(mobile, content, appkey);
			Date now = new Date();
			System.out.println("now:" + now);
			arraylist.add(now.toString());
			register_map.put(mobile, arraylist);
			System.out.println(register_map.get(mobile));
			System.out.println(result);
			renderText("true");
		} catch (ApiException e) {
			System.err.println("Exception when calling DefaultApi#VerCodesms");
			e.printStackTrace();
		}
	}
	//@Before(UserValidator.class)
	public void register1() {//注册	
		String codes=getPara("txtCode");
		System.out.println("codes:"+codes);
		System.out.println("ow"+register_map.get(getPara("user.tel")).get(0));
		System.out.println(register_map.get(getPara("user.tel")));
		System.out.println("sendtime:"+register_map.get(getPara("user.tel")).get(1));
		Date date = new Date();
		long interval =(new Date(register_map.get(getPara("user.tel")).get(1)).getTime()-date.getTime()  ) / 1000 / 60;
		
		System.out.println(interval*60*1000);
		if (getSessionAttr("code").equals(codes)  &&interval<5) {
			User user=getModel(User.class);
			user.save();
			renderText("true");
		}
		else{
			renderText("false");
		}
		
		/*int userid=user.getInt("id");	
		
		String sub[]=getParaValues("subjects.projects");
		for(int i=0;i<sub.length;i++){
			Subjects.me.set("userid", userid).set("projects",sub[i]).save();
			System.out.println(sub[i]);*/		
	
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
