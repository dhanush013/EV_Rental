package com.ev.entities;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class Booking {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@OneToOne(cascade=CascadeType.ALL)
	private User user;
	private boolean driver;
	private int bill;
	private String status;
	private Date start_date;
	private Date end_date;
	private int no_of_days;
	@OneToOne(cascade=CascadeType.ALL)
	private Cars cars;
	private double fare; 
	public Booking(User user, boolean driver, int bill, String status, Date start_date, Date end_date, int no_of_days, Cars cars, double fare){
		super();
		
		this.user = user;
		this.driver = driver;
		this.bill = bill;
		this.status = status;
		this.start_date = start_date;
		this.end_date = end_date;
		this.no_of_days=no_of_days;
		this.cars=cars;
		this.fare=fare;
	}
	
	public double getFare() {
		return fare;
	}

	public void setFare(double fare) {
		this.fare = fare;
	}

	public Cars getCars() {
		return cars;
	}

	public void setCars(Cars cars) {
		this.cars = cars;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public boolean getDriver() {
		return driver;
	}
	public void setDriver(boolean driver) {
		this.driver = driver;
	}
	public int getBill() {
		return bill;
	}
	public void setBill(int bill) {
		this.bill = bill;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getStart_date() {
		return start_date;
	}
	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}
	public Date getEnd_date() {
		return end_date;
	}
	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}

	public int getNo_of_days() {
		return no_of_days;
	}

	public void setNo_of_days(int no_of_days) {
		this.no_of_days = no_of_days;
	}
	
	
	

}

