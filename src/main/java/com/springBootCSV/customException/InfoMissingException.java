package com.springBootCSV.customException;

@SuppressWarnings("serial")
public class InfoMissingException extends RuntimeException{

	public InfoMissingException(String msg) {
		super(msg);
	}
}
