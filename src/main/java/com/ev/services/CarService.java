package com.ev.services;

import java.util.List;

import com.ev.entities.Cars;

public interface CarService {
  
	Cars addCars(Cars cars);
	List<Cars> showCars(Cars cars);
}
