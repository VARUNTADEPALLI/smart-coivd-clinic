package com.varun.Exceptions;

public class ReporterException extends RuntimeException{
	private String message;
	 
    public ReporterException() {}
 
    public ReporterException(String msg)
    {
        super(msg);
        this.message = msg;
    }

}
