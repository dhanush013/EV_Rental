package com.ev.exceptions;

public class UserNotFoundException extends Exception {
	public UserNotFoundException() {
	}
	public UserNotFoundException(String desc) {
		super(desc);
	}
}
