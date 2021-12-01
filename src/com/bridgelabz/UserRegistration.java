package com.bridgelabz;

import java.util.regex.Pattern;

public class UserRegistration {
	
	public String pattern;
	public boolean userFirstName(String firstName) throws InvalidUserRegistrationException {
		pattern = "^[A-Z]{1}[a-z]{2,}";
		if(Pattern.matches(pattern, firstName)) {
			throw new InvalidUserRegistrationException("Name is Valid");
		}
		//System.out.println(Pattern.matches(pattern, firstName));
		return Pattern.matches(pattern, firstName);
	}
	
	public boolean userLastName(String lastName) throws InvalidUserRegistrationException{
		pattern = "^[A-Z]{1}[a-z]{2,}";
		System.out.println(Pattern.matches(pattern, lastName));
		return Pattern.matches(pattern, lastName);
	}
	
	public boolean userEmailId(String emailId)throws InvalidUserRegistrationException {
		pattern = "^[a-zA-Z0-9]+([-_+.a-zA-Z0-9])*@[A-Za-z]+.[A-Za-z]+(.[A-Za-z]{2})*$";
		System.out.println(Pattern.matches(pattern, emailId));
		return Pattern.matches(pattern, emailId);
	}
	
	public boolean userPhoneNumber(String phoneNumber)throws InvalidUserRegistrationException {
		pattern = "^[1-9]{2}[\\s][0-9]{10}$"; 
		System.out.println(Pattern.matches(pattern, phoneNumber));
		return (Pattern.matches(pattern, phoneNumber));
	}
	
	public boolean userPasswordRule1(String password) throws InvalidUserRegistrationException {
		pattern = "^[a-z]{8,}";
		System.out.println(Pattern.matches(pattern, password));
		return (Pattern.matches(pattern, password));
	}
	
	public boolean userPasswordRule2(String password) throws InvalidUserRegistrationException {
		pattern =  "^(?=.*[A-Z])(?=.*[a-z])[A-Za-z]{8,}$";
		System.out.println(Pattern.matches(pattern, password));
		return (Pattern.matches(pattern, password));
	}
	
	public boolean userPasswordRule3(String password) throws InvalidUserRegistrationException {
		pattern = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])[A-Za-z0-9]{8,}$";
		System.out.println(Pattern.matches(pattern, password));
		return (Pattern.matches(pattern, password));
	}
	
	public boolean userPasswordRule4(String password) throws InvalidUserRegistrationException {
		pattern = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[!@#&()�[{}]:;',?/*~$^+=<>]).{8,}$";
		System.out.println(Pattern.matches(pattern, password));
		return (Pattern.matches(pattern, password));
	}
}