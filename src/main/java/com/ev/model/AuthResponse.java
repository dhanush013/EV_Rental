package com.ev.model;

public class AuthResponse {
	private String userName;
	private String role;
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	private boolean authenticationStatus;
	public AuthResponse() {
		// TODO Auto-generated constructor stub
	}
	public AuthResponse(String userName,String role, boolean authenticationStatus) {
		super();
		this.userName = userName;
		this.role=role;
		this.authenticationStatus = authenticationStatus;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public boolean isAuthenticationStatus() {
		return authenticationStatus;
	}
	public void setAuthenticationStatus(boolean authenticationStatus) {
		this.authenticationStatus = authenticationStatus;
	}
	

}
