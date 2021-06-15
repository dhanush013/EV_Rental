package com.ev.repositories;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ev.entities.Booking;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Integer> {

	List<Booking> findByUserId(int id);

}