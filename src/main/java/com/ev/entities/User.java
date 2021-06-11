package com.ev.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="car_rental.users")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	private String name;
	private String password;
	private String role;
	private String email;
	private String status;
	
	
	public User() {

	}


	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", password=" + password + ", role=" + role + ", email="
				+ email + ", status=" + status + "]";
	}


	public int getUserId() {
		return userId;
	}


	public void setUserId(int userId) {
		this.userId = userId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public User( String name, String password, String role, String email, String status) {
		super();
		this.name = name;
		this.password = password;
		this.role = role;
		this.email = email;
		this.status = status;
	}
	
	
	

}
