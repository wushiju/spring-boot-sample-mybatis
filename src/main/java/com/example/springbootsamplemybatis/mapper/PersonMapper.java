/** 
 * Project Name:spring-boot-sample-mybatis 
 * File Name:PersonMapper.java 
 * Package Name:com.example.springbootsamplemybatis.mapper 
 * Date:2017年9月8日下午3:48:17 
 * Copyright (c) 2017, 现代金控 All Rights Reserved. 
 */
package com.example.springbootsamplemybatis.mapper;

import java.util.List;

import com.example.springbootsamplemybatis.domain.Person;

/** 
 * 功能说明
 * @date 2017年9月8日 下午3:48:17
 * @author wusj 
 * @version 1.0
 */
public interface PersonMapper {

	public List<Person> get(Integer age);
}
