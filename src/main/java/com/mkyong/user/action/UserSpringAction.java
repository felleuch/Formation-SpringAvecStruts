package com.mkyong.user.action;

import com.mkyong.user.bo.UserBo;

public class UserSpringAction{

	//DI via Spring
	UserBo userBo;
	
	public UserBo getUserBo() {
		return userBo;
	}

	public void setUserBo(UserBo userBo) {
		this.userBo = userBo;
	}

	public String execute() throws Exception {
		System.out.println("UserSpringAction execute() is executed...");
		userBo.printUser();
		
		return "success";
		
	}
}