package com.snnu.edu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.snnu.edu.entity.Users;

@Controller
@RequestMapping("deptController")
public class DeptController {
	@RequestMapping("login")
	public void login(String uname,String upass){
		System.out.println("name:"+uname+"    "+"pass:"+upass);
	}
	@RequestMapping("delete")
	public void delete(){
		System.out.println("delete");
	}
	@RequestMapping("save")
	public void save(Users user){
		System.out.println(user);
	}
}
