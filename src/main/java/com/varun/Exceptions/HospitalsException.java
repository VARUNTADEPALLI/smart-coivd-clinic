package com.varun.Exceptions;

public class HospitalsException extends RuntimeException{
	private String message;
	 
    public HospitalsException() {}
 
    public HospitalsException(String msg)
    {
        super(msg);
        this.message = msg;
    }

}
