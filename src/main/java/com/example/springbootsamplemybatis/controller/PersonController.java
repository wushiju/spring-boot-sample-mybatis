package com.example.springbootsamplemybatis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootsamplemybatis.service.impl.PersonServiceImpl;

@RestController
@RequestMapping("/person")
public class PersonController {

	@Autowired
    private PersonServiceImpl personService;
	
	@RequestMapping("/list")
	public String list() {
		return "index";
	}
	
	@RequestMapping(value = "/show")
    public String show(){
        return personService.showWorld();
    }

    @RequestMapping(value = "/queryByAge")
    public Object queryByAge(int age){
        return personService.queryByAge(age);
    }
}
