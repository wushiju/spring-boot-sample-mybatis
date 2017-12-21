/** 
 * Project Name:spring-boot-sample-mybatis 
 * File Name:IPersonService.java 
 * Package Name:com.example.springbootsamplemybatis.service 
 * Date:2017年9月8日下午3:43:09 
 * Copyright (c) 2017, 现代金控 All Rights Reserved. 
 */
package com.example.springbootsamplemybatis.service;

import java.util.List;

import com.example.springbootsamplemybatis.domain.Person;

/**
 * 功能说明
 * 
 * @date 2017年9月8日 下午3:43:09
 * @author wusj
 * @version 1.0
 */
public interface IPersonService {

	public List<Person> queryByAge(int age);
}
