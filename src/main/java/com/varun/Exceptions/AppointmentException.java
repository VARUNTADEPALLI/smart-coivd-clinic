package com.varun.Exceptions;

public class AppointmentException extends RuntimeException{

	   private String message;
	   
	    public AppointmentException() {}
	 
	    public AppointmentException(String msg)
	    {
	        super(msg);
	        this.message = msg;
	    }
}
