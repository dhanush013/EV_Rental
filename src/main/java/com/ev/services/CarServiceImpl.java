package com.ev.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ev.entities.Cars;
import com.ev.exceptions.CarsNotFoundException;
import com.ev.repositories.CarsRepository;

@Service
public class CarServiceImpl implements CarService{
   
	private CarsRepository carsRepository;
	
	
	
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



	@Override
	public String removeCars(int id) throws CarsNotFoundException  {
      
        Optional<Cars> car=carsRepository.findById(id);
        if(car.isPresent())
        {
            carsRepository.deleteById(id);
            return "deleted";
        }
        else
        {
        	throw new CarsNotFoundException("record not found");
        }
		
	}



	/*@Override
	public String updateCars( int Id,Cars cars) throws CarsNotFoundException {
		 Optional<Cars> car=carsRepository.findById(Id);
		 if(car.isPresent())
	        {
			 carsRepository.setUserInfoById(cars.getModel(),cars.getMark(),cars.getCar_class(),cars.getCost(),cars.getId());
				return "updated";
	        }
	        else
	        {
	        	throw new CarsNotFoundException("record not found");
	        }
		
		
	}*/
	

}
