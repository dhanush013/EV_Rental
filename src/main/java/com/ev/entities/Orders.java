package com.ev.entities;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;


@Entity
@Table(name="orders")
public class Orders {
	private int id;
	private int userId;
	private String driver;
	private int bill;
	private String status;
	private int start_date;
	private int end_date;
	public Orders(int id, int userId, String driver, int bill, String status, int start_date, int end_date) {
		super();
		this.id = id;
		this.userId = userId;
		this.driver = driver;
		this.bill = bill;
		this.status = status;
		this.start_date = start_date;
		this.end_date = end_date;
	}
	@Id
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getDriver() {
		return driver;
	}
	public void setDriver(String driver) {
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
	public int getStart_date() {
		return start_date;
	}
	public void setStart_date(int start_date) {
		this.start_date = start_date;
	}
	public int getEnd_date() {
		return end_date;
	}
	public void setEnd_date(int end_date) {
		this.end_date = end_date;
	}
	
	
	

}
