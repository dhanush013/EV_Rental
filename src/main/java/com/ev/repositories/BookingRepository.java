package com.ev.repositories;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ev.entities.Booking;
import com.ev.entities.User;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Integer> {

	List<Booking> findByUser(User user) ;
	Booking findById(int bookingId) ;
	@Query("select count(cars from booking (userId=Distinct))");
	
	}
