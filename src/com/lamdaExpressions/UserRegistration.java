package com.lamdaExpressions;

import java.util.regex.Pattern;

import com.bridgelabz.InvalidUserRegistrationException;

public class UserRegistration {
	
	public String pattern;
	public boolean userFirstName(String firstName) throws InvalidUserRegistrationException {
		pattern = "^[A-Z]{1}[a-z]{2,}$";
		System.out.println(Pattern.matches(pattern, firstName));
		return Pattern.matches(pattern, firstName);
	}
	public boolean userLastName(String lastName) throws InvalidUserRegistrationException{
		pattern = "^[A-Z]{1}[a-z]{2,}$";
		System.out.println(Pattern.matches(pattern, lastName));
		return Pattern.matches(pattern, lastName);
	}
	
	public boolean userEmailId(String emailId)throws InvalidUserRegistrationException {
		pattern ="^[0-9a-zA-Z+-._]+@[0-9a-zA-Z]+.[a-zA-Z]{2,3}.([a-zA-z]{2,3})*$";
		System.out.println(Pattern.matches(pattern, emailId));
		return Pattern.matches(pattern, emailId);
	}
	
	public boolean userPhoneNumber(String phoneNumber)throws InvalidUserRegistrationException {
		pattern = "^([+])?[91]{2}[\\s]?[6-9][0-9]{9}$"; 
		System.out.println(Pattern.matches(pattern, phoneNumber));
		return (Pattern.matches(pattern, phoneNumber));
	}
	
	public boolean userPasswordRule1(String password) throws InvalidUserRegistrationException {
		pattern = "[a-z]{8,}$";
		System.out.println(Pattern.matches(pattern, password));
		return (Pattern.matches(pattern, password));
	}
	
	public boolean userPasswordRule2(String password) throws InvalidUserRegistrationException {
		pattern = "(?=.*[A-Z])[A-Za-z]{8,}$";
		System.out.println(Pattern.matches(pattern, password));
		return (Pattern.matches(pattern, password));
	}
	
	public boolean userPasswordRule3(String password) throws InvalidUserRegistrationException {
		pattern = "(?=.*[0-9])(?=.*[A-Z])[A-Za-z0-9]{8,}$";
		System.out.println(Pattern.matches(pattern, password));
		return (Pattern.matches(pattern, password));
	}
	
	public boolean userPasswordRule4(String password) throws InvalidUserRegistrationException {
		pattern = "(?=.*[0-9])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>])[a-zA-Z0-9!@#&()–[{}]:;',?/*~$^+=<>].{8,}$";
		System.out.println(Pattern.matches(pattern, password));
		return (Pattern.matches(pattern, password));
	}

}
