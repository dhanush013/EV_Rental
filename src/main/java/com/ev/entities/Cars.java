package com.ev.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cars 
{  
	
   @Id
   @GeneratedValue(strategy=GenerationType.IDENTITY)
   private int id;
   private String model;
   private String mark;
   private String car_class;
   private int cost;
   
   public Cars() {
	   
   }

public Cars(int id, String model, String mark, String car_class, int cost) {
	super();
	this.id = id;
	this.model = model;
	this.mark = mark;
	this.car_class = car_class;
	this.cost = cost;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getModel() {
	return model;
}

public void setModel(String model) {
	this.model = model;
}

public String getMark() {
	return mark;
}

public void setMark(String mark) {
	this.mark = mark;
}

public String getCar_class() {
	return car_class;
}

public void setCar_class(String car_class) {
	this.car_class = car_class;
}

public int getCost() {
	return cost;
}

public void setCost(int cost) {
	this.cost = cost;
}
   
}
