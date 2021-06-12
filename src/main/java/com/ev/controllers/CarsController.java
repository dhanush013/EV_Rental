package com.ev.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ev.services.CarService;

@RestController
@RequestMapping("/cars")
public class CarsController {
	private CarService carService;

	public CarsController(CarService carService) {
		super();
		this.carService = carService;
	}

	
	

}
