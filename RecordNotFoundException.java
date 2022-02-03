package com.time.Exception;

public class RecordNotFoundException extends RuntimeException {
	
	private static final long serialVersionVID = 1L;
	 
	public RecordNotFoundException(String message) {
		
		super(message);
	}

}
