package com.ev.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ev.entities.Booking;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Integer> {

}
