package com.ev.repositories;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ev.entities.Cars;

import antlr.collections.List;

@Repository
public interface CarsRepository extends JpaRepository<Cars,Integer>{
	
	
	/*@Modifying
	@Query("update Cars u set u.model = ?1,u.mark=?2,u.car_class=?3,u.cost = ?4 where u.id = ?5")
	void setUserInfoById(String model, String mark,String car_class,int cost, int Id);
	Cars findById( int id);*/
}
