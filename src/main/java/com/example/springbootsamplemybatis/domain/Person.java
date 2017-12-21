/** 
 * Project Name:spring-boot-sample-mybatis 
 * File Name:Person.java 
 * Package Name:com.example.springbootsamplemybatis.domain 
 * Date:2017年9月8日下午3:32:41 
 * Copyright (c) 2017, 现代金控 All Rights Reserved. 
 */
package com.example.springbootsamplemybatis.domain;

/**
 * 功能说明
 * 
 * @date 2017年9月8日 下午3:32:41
 * @author wusj
 * @version 1.0
 */
public class Person {

	private Long id;
	private int age;
	private String name;
	private String address;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
