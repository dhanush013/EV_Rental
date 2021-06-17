package com.ev.services;

import java.util.List;

import com.ev.entities.Cars;
import com.ev.exceptions.CarsNotFoundException;

public interface CarService {
  
	Cars addCars(Cars cars);
	List<Cars> showCars();
	String removeCars(int id) throws CarsNotFoundException;
	//String updateCars(int id,Cars cars) throws CarsNotFoundException;
}
