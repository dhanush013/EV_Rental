package com.ev.repositories;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ev.entities.Cars;

import antlr.collections.List;

@Repository
public interface CarsRepository extends JpaRepository<Cars,Integer>{
	
	

}
