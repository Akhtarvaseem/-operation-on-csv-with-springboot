package com.springBootCSV.customException;

@SuppressWarnings("serial")
public class IdInvalidException extends RuntimeException{
	
	public IdInvalidException(String msg) {
		
		super(msg);
	}

}
