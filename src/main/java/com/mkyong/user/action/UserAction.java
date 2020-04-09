package com.mkyong.user.action;

import org.apache.struts2.ServletActionContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.mkyong.user.bo.UserBo;
import com.opensymphony.xwork2.ActionSupport;
 
public class UserAction extends ActionSupport{

	//DI via Spring
	UserBo userBo;
	
	public UserBo getUserBo() {
		System.out.println("UserAction getUserBo() is executed...");
		return userBo;
	}

	public void setUserBo(UserBo userBo) {
		System.out.println("UserAction setUserBo() is executed...");
		this.userBo = userBo;
	}

	public String execute() throws Exception {
		System.out.println("UserAction execute() is executed...");

		
		userBo.printUser();
		
		return SUCCESS;
		
	}
}