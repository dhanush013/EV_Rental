package com.ev.services;

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
	public void addCars(int id, Cars cars) {
		cars.setId(2);
		cars.setCar_class("high");
		cars.setCost(25);
		cars.setMark("ford");
		cars.setModel("sedan");
		
		Cars car=carsRepository.findById(id);
		
		carsRepository.save(car);
		
	}
	

}
