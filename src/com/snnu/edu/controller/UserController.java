package com.snnu.edu.controller;

import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.snnu.edu.entity.Users;
import com.snnu.edu.serviceInterface.UserService;
import com.snnu.edu.serviceInterface.impl.UserServiceImpl;
import com.snnu.edu.util.Tools;

@Controller
@RequestMapping("user")
@SuppressWarnings("unchecked")
public class UserController {
	UserService us = new UserServiceImpl();
	
	@RequestMapping("login")
	public String login(String name,String password){					
		boolean flag = us.findIsExitUser(name, password);
		HashMap hashmap = new HashMap();
		if(flag){			
			hashmap.put("statusCode", 200);
			hashmap.put("msg", "OK");		
		}else{
			hashmap.put("statusCode", 400);
			hashmap.put("msg", "Resource is not found not exist");
		}
		return Tools.getJson(hashmap);
	}
	
	@RequestMapping("delete")
	public void delete(){
		System.out.println("delete");
	}
	@RequestMapping("add")
	public String add(Users user){
		boolean flag = us.saveOrUpdateUsers(user);
		HashMap hashmap = new HashMap();
		if(flag){			
			hashmap.put("statusCode", 200);
			hashmap.put("msg", "OK");		
		}else{
			hashmap.put("statusCode", 500);
			hashmap.put("msg", "Server error");
		}
		return Tools.getJson(hashmap);
	}
}
