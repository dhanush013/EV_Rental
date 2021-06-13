package com.ev.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ev.entities.Cars;
import com.ev.repositories.CarsRepository;

@Service
public class CarServiceImpl implements CarService{
   
	private CarsRepository carsRepository;
	
	
	@Autowired
	public CarServiceImpl(CarsRepository carsRepository) {
		super();
		this.carsRepository = carsRepository;
	}



	@Override
	public Cars addCars(Cars cars) {
		
		
		Cars car=carsRepository.save(cars);
		return car;
		
		
	}



	@Override
	public List<Cars> showCars() {
		
		List<Cars> car=carsRepository.findAll();
		
		return car;
	}



	

}
