package com.ev.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.shop.app.entity.User;
import com.shop.app.exception.ExistingUserException;
import com.shop.app.exception.UserNotFoundException;
import com.shop.app.service.ookingervice;

@RestController
@RequestMapping("/booking")

public class BookingController {
	private BookingService bookingService;
	public BookingController (BookingService bookingService) {
		super();
		this.bookingService=bookingService;
	}
	@PostMapping("/login")
	public ResponseEntity<AuthenticationResponse> login(@RequestBody User user) throws UserNotFoundException{
		return new ResponseEntity<AuthenticationResponse>(userService.validate(user),HttpStatus.OK);
	}
	

}
