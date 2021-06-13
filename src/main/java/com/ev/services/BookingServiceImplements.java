package com.ev.services;

import org.springframework.stereotype.Service;
import com.ev.entities.Booking;
import com.ev.entities.User;
import com.ev.repositories.BookingRepository;
import com.ev.repositories.UserRepository;

@Service
public class BookingServiceImplements implements BookingService {
	private UserRepository userRepository;
	private BookingRepository bookingRepository;
	
	
	
	public BookingServiceImplements(UserRepository userRepository, BookingRepository bookingRepository) {
		super();
		this.userRepository=userRepository;
		this.bookingRepository=bookingRepository;
	}
	/*
	@Override
	public Booking addBooking(Booking booking ){
		User user= userRepository.findbyUserId(booking.getUserId());
		if(user.getRole()=="admin") {
			
			bookingRepository.save(booking);
		}
		return booking;
	}
	
	*/



	@Override
	public Booking addBooking(Booking booking) {
		// TODO Auto-generated method stub
		return null;
	}

}
