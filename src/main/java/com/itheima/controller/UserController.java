package com.itheima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.dubbo.config.annotation.Reference;
import com.itheima.demo.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Reference
	private UserService uservice;
	@RequestMapping("/showName")
	@ResponseBody 
	public String getName() {
		return uservice.getName();
	}
	

}
