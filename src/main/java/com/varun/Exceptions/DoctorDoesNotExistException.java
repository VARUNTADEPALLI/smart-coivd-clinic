package com.varun.Exceptions;

public class DoctorDoesNotExistException extends RuntimeException
{
	 private String message;
	 
	    public DoctorDoesNotExistException() {}
	 
	    public DoctorDoesNotExistException(String msg)
	    {
	        super(msg);
	        this.message = msg;
	    }


}
