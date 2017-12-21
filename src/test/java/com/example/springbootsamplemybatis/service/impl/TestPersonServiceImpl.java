/** 
 * Project Name:spring-boot-sample-mybatis 
 * File Name:TestPersonServiceImpl.java 
 * Package Name:com.example.springbootsamplemybatis.service.impl 
 * Date:2017年9月11日下午4:33:52 
 * Copyright (c) 2017, 现代金控 All Rights Reserved. 
 */
package com.example.springbootsamplemybatis.service.impl;

import static org.junit.Assert.fail;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.example.springbootsamplemybatis.domain.Person;

/**
 * 功能说明
 * 
 * @date 2017年9月11日 下午4:33:52
 * @author wusj
 * @version 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestPersonServiceImpl {

	@Autowired
	private PersonServiceImpl personService;

	@Test
	public void testShowWorld() {
		String expectedResult = "hello world!";
		String result = personService.showWorld();
		Assert.assertTrue("数据一致", expectedResult.equals(result));
		Assert.assertTrue("数据不一致", !expectedResult.equals(result));
	}

	@Test
	public void testQueryByAge() {
		List<Person> persons = personService.queryByAge(51);
		Assert.assertTrue("数据集不对", persons.size() == 0);
		Assert.assertTrue("数据一致", persons.get(0).getName().equals("cq2"));
	}

}
