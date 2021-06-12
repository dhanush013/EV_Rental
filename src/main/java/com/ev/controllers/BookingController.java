package com.ev.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ev.entities.Booking;
import com.ev.services.BookingService;

@CrossOrigin
@RestController
@RequestMapping("/booking")

public class BookingController {
	private BookingService bookingService;
	public BookingController (BookingService bookingService) {
		super();
		this.bookingService=bookingService;
	}
	@PostMapping
	public ResponseEntity<Booking> addBooking(@RequestBody Booking booking){
	
		return new ResponseEntity<Booking>(bookingService.addBooking(booking),HttpStatus.CREATED);
	
	}
	
	
	

}
