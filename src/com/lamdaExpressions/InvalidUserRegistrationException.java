package com.lamdaExpressions;

public class InvalidUserRegistrationException extends Exception {
	
	Invalid invalid;

	enum Invalid {
		FirstName, LastName, EmailId, Password, PhoneNumber
	}

	Invalid exception;
	
	public InvalidUserRegistrationException(Invalid exception, String msg) {
		super(msg);
		this.exception =exception;
	}
}
