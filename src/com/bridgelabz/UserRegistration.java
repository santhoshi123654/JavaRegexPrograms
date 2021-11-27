package com.bridgelabz;

import java.util.regex.Pattern;

public class UserRegistration {
	
	public String pattern;
	public boolean userFirstName(String firstName) {
		pattern = "^[A-Z]{1}[a-z]{2,}";
		System.out.println(Pattern.matches(pattern, firstName));
		return true;
	}
	
	public boolean userLastName(String lastName) {
		pattern = "^[A-Z]{1}[a-z]{2,}";
		System.out.println(Pattern.matches(pattern, lastName));
		return true;
	}
	
	public boolean userEmailId(String emailId) {
		pattern = "^[a-zA-Z0-9]+([-_+.a-zA-Z0-9])*@[A-Za-z]+.[A-Za-z]+(.[A-Za-z]{2})*$";
		System.out.println(Pattern.matches(pattern, emailId));
		return true;
	}
	
	public boolean userPhoneNumber(String phoneNumber) {
		pattern = "^[1-9]{2}[\\s][0-9]{10}$"; 
		System.out.println(Pattern.matches(pattern, phoneNumber));
		return true;
	}
	
	public boolean userPasswordRule1(String password) {
		pattern = "^[a-z]{8,}";
		System.out.println(Pattern.matches(pattern, password));
		return true;
	}
	
	public boolean userPasswordRule2(String password) {
		pattern = "^(?=.*[A-Z])[a-z]{8,}$";
		System.out.println(Pattern.matches(pattern, password));
		return true;
	}
	
	public boolean userPasswordRule3(String password) {
		pattern = "^(?=.*[A-Z])(?=.*[0-9])[a-z]{8,}$";
		System.out.println(Pattern.matches(pattern, password));
		return true;
	}
	
	public boolean userPasswordRule4(String password) {
		pattern = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,}$";
		System.out.println(Pattern.matches(pattern, password));
		return true;
	}
}