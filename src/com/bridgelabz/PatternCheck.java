package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PatternCheck {
	UserRegistration registration = new UserRegistration();

	public void firstName() {
		
		String pattern = "^[A-Z]{1}[a-z]{2,}";
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.println("Enter the FirstName");
			String firstName = scanner.next();
			
			if (Pattern.matches(pattern, firstName)) {
				System.out.println("Valid");
				break;
			}
			else {
				System.out.println("Enter Valid FirstName starting with UpperCase");
			}
		}
	}
	public void lastName() {

		String pattern = "^[A-Z]{1}[a-z]{2,}";
		Scanner scanner = new Scanner(System.in);
		
		
		while (true) {
			System.out.println("Enter the LastName");
			String lastName = scanner.next();
			if (Pattern.matches(pattern, lastName)) {
				System.out.println("Valid");
				break;
			}
		
			else {
				System.out.println("Enter Valid LastName starting with UpperCase");
	
			}
		}
	}
	public void emailIdPattern() {
		
		String pattern = "^[a-zA-Z0-9]+([-_+.a-zA-Z0-9])*@[A-Za-z]+.[A-Za-z]+(.[A-Za-z]{2})*$";
		Scanner scanner = new Scanner(System.in);
	
		
		while (true) {
			System.out.println("Enter the EmailId : ");
			String emailId = scanner.next();
			if (Pattern.matches(pattern, emailId)) {
				registration.setEmailId(emailId);
				break;
			}
			else
				System.out.println("Enter Valid EmailId ");
			}
	}
	
	public void phoneNumberPattern() {
		
	String pattern = "^[1-9]{2}[\\s][0-9]{10}$";
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the PhoneNumber : ");
	
		while (true) {
			String phoneNumber = scanner.nextLine();
			if (Pattern.matches(pattern, phoneNumber)) {
				registration.setPhoneNumber(phoneNumber);
				System.out.println("Valid");
				break;
			}
			else {
				System.out.println("Enter Valid PhoneNumber ");
			}
		}
	}
	
	public void passwordPatternRule1() {
		
		String pattern = "^[0-9A-Za-z]{8,}";
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Password : ");
		
			while (true) {
				String password = scanner.nextLine();
				if (Pattern.matches(pattern, password)) {
					registration.setPassword(password);
					System.out.println("Valid");
					break;
				}
				else {
					System.out.println("Enter Valid Password with minimum Eight characters ");
				}
			}
		}
}