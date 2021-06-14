package com.ev.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ev.entities.User;
import com.ev.exceptions.UserNotFoundException;
import com.ev.model.AuthResponse;
import com.ev.services.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	private UserService userService;
	
	public UserController(UserService userService) {
		super();
		this.userService = userService;
	}

	@PostMapping("/register")
	public ResponseEntity<User> register(@RequestBody User user){
		User user1=userService.registerUser(user);
		return new ResponseEntity<User>(user1,HttpStatus.CREATED);
	}
	@PostMapping("/login")
	public ResponseEntity<AuthResponse> login(@RequestBody User user) throws UserNotFoundException{
		AuthResponse authReponse=userService.validate(user);
		return new ResponseEntity<AuthResponse>(authReponse,HttpStatus.OK);
	}
	
}