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
			String firstName = scanner.next();
			
			if (Pattern.matches(pattern, firstName)) {
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
		System.out.println("Enter the EmailId : ");
		while (true) {
			String emailId = scanner.next();
			if (Pattern.matches(pattern, emailId)) {
				registration.setLastName(emailId);
				System.out.println("Valid Email");
				break;
			}
			else
				System.out.println("Enter Valid EmailId ");
			}
	}
}