package com.ev.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ev.entities.User;
import com.ev.services.UserService;

@RestController
public class RegistrationController {
	
	@Autowired
	public UserService userService;
	
	@PostMapping(value = "/registrationProcess")
	public String addUser(@ModelAttribute("user") User user, ModelMap model) {
		
		userService.addUser(user);
	    model.addAttribute("username", user.getUsername());

	    return "welcome";
	}

	
}
