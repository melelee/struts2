package com.mengll.action;

import com.opensymphony.xwork2.ActionSupport;

public class loginAction extends ActionSupport {
	public String execute() throws Exception {
		System.out.println("loginactiong----excute");
		return "success";
	}
}