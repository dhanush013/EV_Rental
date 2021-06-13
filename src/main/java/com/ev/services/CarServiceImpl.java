package com.ev.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ev.entities.Cars;
import com.ev.repositories.CarsRepository;



@Service
public class CarServiceImpl implements CarService{

	private CarsRepository carsRepository;
	
	
	
	public CarServiceImpl(CarsRepository carsRepository) {
		super();
		this.carsRepository = carsRepository;
	}



	@Override
	public List<Cars> getCars() {
		return carsRepository.findAll();
	}



	
	

}
