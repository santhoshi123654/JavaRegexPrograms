package com.bridgelabz;
import java.util.regex.Pattern;
import java.util.Scanner;

public class RegexMain {

	public static void main(String[] args) {
		
		UserRegistration registration = new UserRegistration();

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the User First Name");

		while (true) {
			String fName = scanner.next();
			if (PatternCheck.firstName(fName)) {
				registration.setFirstName(fName);
				break;
			}
			else {
				System.out.println("The Valid FirstName should Strat with one UpperCase ");
			}
		}
		System.out.println(registration);
	}
	
}
