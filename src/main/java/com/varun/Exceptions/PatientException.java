package com.varun.Exceptions;

public class PatientException extends RuntimeException{
	
	private String message;
	 
    public PatientException() {}
 
    public PatientException(String msg)
    {
        super(msg);
        this.message = msg;
    }

}
