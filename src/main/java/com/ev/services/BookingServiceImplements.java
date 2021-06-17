/*package com.ev.services;

import java.util.Date;
import java.util.Optional;

import org.springframework.stereotype.Service;
import com.ev.entities.Booking;
import com.ev.entities.Cars;
import com.ev.entities.User;
import com.ev.repositories.BookingRepository;
import com.ev.repositories.UserRepository;
import com.ev.repositories.CarsRepository;

import antlr.collections.List;


@Service
public class BookingServiceImplements implements BookingService {
	
	private BookingRepository bookingRepository;
	private CarsRepository carsRepository;
	
	
	
	public BookingServiceImplements(BookingRepository bookingRepository) {
		super();
		
		this.bookingRepository=bookingRepository;
	}
	
	@Override
	public Booking addBooking(Booking booking )
	 {
		Optional<Cars> cars=carsRepository.findById(booking.getCars().getId());

		
		if(booking.getDriver()!=false) {
			
			booking.setFare(cars.getCost()*(booking.getNo_of_days()*35));
		}else {
			booking.setFare(cars.getCost()*booking.getNo_of_days());
			}
		
			
			bookingRepository.save(booking);
		
		return booking;
	}

	@Override
	public List displayAllBookings() {
		// TODO Auto-generated method stub
		return null;
	}
 
	
	
	

}*/