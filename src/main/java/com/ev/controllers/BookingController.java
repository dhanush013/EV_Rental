package com.ev.controllers;

	import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
	import org.springframework.http.ResponseEntity;
	import org.springframework.web.bind.annotation.CrossOrigin;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ev.entities.Booking;
import com.ev.exceptions.UserNotFoundException;
import com.ev.repositories.BookingRepository;
	import com.ev.services.BookingService;

	


	@CrossOrigin
	@RestController
	@RequestMapping("/booking")

	public class BookingController {
		@Autowired
		private BookingService bookingService;
		@Autowired
		private BookingRepository bookingRepository;
		public BookingController(BookingService bookingService, BookingRepository bookingRepository) {
			super();
			this.bookingService = bookingService;
			this.bookingRepository=bookingRepository;
		}
		@PostMapping("/add")
		public ResponseEntity<Booking> addBooking(@RequestBody Booking booking){
		
			return new ResponseEntity<Booking>(bookingService.addBooking(booking),HttpStatus.CREATED);
		
		}
		@GetMapping("/find")
		public ResponseEntity<List<Booking>> getBooking(){
		
			return new ResponseEntity<List<Booking>>(bookingRepository.findAll(),HttpStatus.FOUND);
		
		}
		@GetMapping("/view")
		public ResponseEntity<List<Booking>> view(@RequestParam int id){
				List<Booking> b=bookingRepository.findByUserId(id);
			
				return new ResponseEntity<List<Booking>>(b,HttpStatus.FOUND);
			
		}
		

	}