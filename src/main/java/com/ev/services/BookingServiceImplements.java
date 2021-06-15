package com.ev.services;

import org.springframework.stereotype.Service;
import com.ev.entities.Booking;
import com.ev.repositories.BookingRepository;


@Service
public class BookingServiceImplements implements BookingService {
	
	private BookingRepository bookingRepository;
	
	
	
	public BookingServiceImplements(BookingRepository bookingRepository) {
		super();
		
		this.bookingRepository=bookingRepository;
	}
	
	@Override
	public Booking addBooking(Booking booking )
	 {
			
			bookingRepository.save(booking);
		
		return booking;
	}
	
	

}