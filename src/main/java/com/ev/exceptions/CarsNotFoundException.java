package com.ev.exceptions;

public class CarsNotFoundException extends Exception{
	public CarsNotFoundException() {
		
	}
      public CarsNotFoundException(String msg) {
    	  super(msg);
    	  
      }
}
