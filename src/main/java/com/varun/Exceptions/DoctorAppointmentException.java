package com.varun.Exceptions;

public class DoctorAppointmentException extends RuntimeException{
	private String message;
	 
    public DoctorAppointmentException() {}
 
    public DoctorAppointmentException(String msg)
    {
        super(msg);
        this.message = msg;
    }

}
