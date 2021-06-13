package com.ev.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ev.entities.Cars;

import com.ev.services.CarService;

@RestController
@RequestMapping("/api")
public class CarsController {
	private CarService carService;
    
	@Autowired
	public CarsController(CarService carService) {
		super();
		this.carService = carService;
	}

@PostMapping ("/addcars")
public ResponseEntity<Cars> add(@RequestBody Cars cars){
	Cars car1=carService.addCars(cars);
	return new ResponseEntity<Cars>(car1,HttpStatus.CREATED);
}

@PostMapping("/showcars")
public ResponseEntity<List<Cars>> show(@RequestBody Cars cars){
	List<Cars> car2=carService.showCars(cars);
	return new ResponseEntity<List<Cars>>(car2,HttpStatus.OK);
	
	
}
	

}
