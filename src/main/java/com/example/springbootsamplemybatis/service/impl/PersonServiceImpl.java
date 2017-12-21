/** 
 * Project Name:spring-boot-sample-mybatis 
 * File Name:PersonServiceImpl.java 
 * Package Name:com.example.springbootsamplemybatis.service.impl 
 * Date:2017年9月8日下午3:34:42 
 * Copyright (c) 2017, 现代金控 All Rights Reserved. 
 */
package com.example.springbootsamplemybatis.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springbootsamplemybatis.domain.Person;
import com.example.springbootsamplemybatis.mapper.PersonMapper;
import com.example.springbootsamplemybatis.service.IPersonService;

/**
 * 功能说明
 * 
 * @date 2017年9月8日 下午3:34:42
 * @author wusj
 * @version 1.0
 */
@Service
public class PersonServiceImpl implements IPersonService {

	@Autowired
	private PersonMapper personMapper;

	public String showWorld() {
		return "hello world!";
	}

	public List<Person> queryByAge(int age) {
		return personMapper.get(age);
	}
}
