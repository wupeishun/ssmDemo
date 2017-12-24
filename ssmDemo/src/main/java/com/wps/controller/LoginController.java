package com.wps.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wps.service.UserService;

@Controller
@RequestMapping("/user")
public class LoginController {
	
	@Autowired 
    private UserService userService = null;
	
	@ResponseBody
	@RequestMapping("/login")
	public String login(HttpServletRequest request){
		userService.findUser();
		return null;
		
		
	}

}
