package com.varun.Exceptions;

public class NoUserException extends RuntimeException
{
	private String message;
	 
    public NoUserException() {}
 
    public NoUserException(String msg)
    {
        super(msg);
        this.message = msg;
    }

}
