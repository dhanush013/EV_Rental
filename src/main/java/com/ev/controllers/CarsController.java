package com.ev.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ev.entities.Cars;
import com.ev.exceptions.CarsNotFoundException;
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
public ResponseEntity<List<Cars>> show(){
	List<Cars> car2=carService.showCars();
	return new ResponseEntity<List<Cars>>(car2,HttpStatus.OK);
	
	
}
	
@DeleteMapping("delete/{id}")
public ResponseEntity<Cars> remove(@PathVariable("id") int id) {
	
	try {
		String car=carService.removeCars(id);
		return new ResponseEntity<Cars>(HttpStatus.OK);
	} catch (CarsNotFoundException e) {
		
		return new  ResponseEntity(e.getMessage(),HttpStatus.NOT_FOUND);
	}
	
}
@PutMapping("update/{id}")
public ResponseEntity<Cars> update(@PathVariable("id") int id,@RequestBody Cars cars){
	
	try {
		carService.updateCars(id,cars);
		return new ResponseEntity<Cars>(HttpStatus.OK);
	} catch (CarsNotFoundException e) {
		// TODO Auto-generated catch block
		return new  ResponseEntity(e.getMessage(),HttpStatus.NOT_FOUND);
	}
	
	
}





}




