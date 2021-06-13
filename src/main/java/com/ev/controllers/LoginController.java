package com.ev.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ev.model.Login;
import com.ev.entities.User;
import com.ev.services.UserService;

@RestController
public class LoginController {
	
	@Autowired
	public UserService userService;
	
	@PostMapping(value = "/loginProcess")
	public String login(@ModelAttribute("login") Login login, BindingResult bindingResult, ModelMap model) {
		User user = userService.validateUser(login);
	    boolean isValidUser = false;
	    
	    if (null != user && user.getUsername().equals(login.getUsername())
	        && user.getPassword().equals(login.getPassword())) {
	    	isValidUser = true;
	    	model.addAttribute("username", user.getUsername());
	    }
	    return isValidUser ? "welcome" : "login";
	}
	
}
