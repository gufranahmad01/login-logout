package com.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.login.entities.User;
import com.login.services.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	//http://localhost:8080/showReg
	@RequestMapping("/showReg")
	public String showRegistrationPage() {
		return "login/registerUser";
	}
	
	@RequestMapping("/registerUser")
	public String registerUser(@ModelAttribute("user")User user) {
		userService.saveUser(user);
		return "login/registerUser";
	}
	
	
}
