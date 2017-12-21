/** 
 * Project Name:spring-boot-sample-mybatis 
 * File Name:TestUser.java 
 * Package Name:com.example.springbootsamplemybatis.domain 
 * Date:2017年9月8日下午3:51:49 
 * Copyright (c) 2017, 现代金控 All Rights Reserved. 
 */
package com.example.springbootsamplemybatis.domain;

/**
 * 功能说明
 * 
 * @date 2017年9月8日 下午3:51:49
 * @author wusj
 * @version 1.0
 */
public class User {

	private Long user_id;
	private String user_name;
	private String login_name;
	private String login_password;
	private String status;

	public Long getUser_id() {
		return user_id;
	}

	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getLogin_name() {
		return login_name;
	}

	public void setLogin_name(String login_name) {
		this.login_name = login_name;
	}

	public String getLogin_password() {
		return login_password;
	}

	public void setLogin_password(String login_password) {
		this.login_password = login_password;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
