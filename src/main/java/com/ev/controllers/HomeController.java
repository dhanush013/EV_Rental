package com.ev.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ev.entities.User;
import com.ev.model.Login;
import com.ev.services.UserService;

@RestController
@RequestMapping("/")
public class HomeController {
	@Autowired
	public UserService userService;

	@GetMapping("/home")
	public String home(Map<String, Object> map) {
		return "home";
	}

	@GetMapping("/showLoginPage")
	public String showLoginPage(ModelMap model) {
		model.addAttribute(new Login());
		return "login";
	}

	@GetMapping("/showRegistrationPage")
	public String showRegistrationPage(ModelMap model) {
		model.addAttribute(new User());
		return "registration";
	}
	
}
