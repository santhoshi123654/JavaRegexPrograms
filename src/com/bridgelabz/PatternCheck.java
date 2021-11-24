package com.bridgelabz;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class PatternCheck {

	
	UserRegistration registration = new UserRegistration();

	public void firstNamePattern() {

		String pattern = "^[A-Z]{1}[a-z]{2,}";
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the First Name : ");

		while (true) {
			String fName = scanner.next();
			if (Pattern.matches(pattern, fName)) {
				registration.setFirstName(fName);
				break;
			} else
				System.out.println("Enter the Valid First Name as : Abcd");
		}
	}

	public void lastNamePattern() {

		String pattern = "^[A-Z]{1}[a-z]{2,}$";
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Last Name : ");
		
		while (true) {
			String lName = scanner.next();
			
			if (Pattern.matches(pattern, lName)) {
				registration.setLastName(lName);
				break;
			} 
			else {
				System.out.println("Enter the Valid Last Name as : Abcde");
		
			}
		}
	}

	public void printResult() {
		System.out.println(registration);

	}

	public void emailIdPattern() {

		String pattern = "^[a-zA-Z0-9]+([-_+.a-zA-Z0-9])*@[A-Za-z]+.[A-Za-z]+(.[A-Za-z]{2})*$";
		Scanner scanner = new Scanner(System.in);
		System.out.println("enterEmail ID : ");
		while (true) {
			String email = scanner.nextLine();
			if (Pattern.matches(pattern, email)) {
				registration.setLastName(email);
				break;
			} 
			else {
				System.out.println("Enter the Valid EmailId ");
			}
		}
	}

	public void phoneNumber() {

		String pattern = "^[1-9]{2}[\\s][0-9]{10}$";
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter phone number : ");
		while (true) {
			String phoneNumber = scanner.nextLine();
			if (Pattern.matches(pattern, phoneNumber)) {
				registration.setPhoneNumber(phoneNumber);
				break;
			}
			else {
				System.out.println("Enter the Valid PhoneNumber ");
			}
		}
	}

	public void passwordPattern() {

		String pattern = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,}$";
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Password with atleast OneUpperCase,atleast One Special Character and atleast One Digit");
		
		while (true) {
			String password = scanner.nextLine();
			if (Pattern.matches(pattern, password)) {
				registration.setPassword(password);
				break;
			} else
				System.out.println("Enter the Valid Password ");
		}
	}

	public void emailsSampleChecking() throws IOException{

		String pattern = "^[a-zA-Z0-9]+([-_+.]?[a-zA-Z0-9])*@[A-Za-z0-9]{1,}.[A-Za-z]{2,}(.[A-Za-z]{2,})*$";
		String filePath = "C:\\Users\\santhu\\Desktop\\RFP Assignments\\JavaRegexPrograms\\src\\com\\bridgelabz\\EmailSamples";
		List<String> lines = new ArrayList<String>();
		
		Path path = Paths.get(filePath);
		lines = Files.readAllLines(path);

		BufferedWriter writer;
		writer = new BufferedWriter(new FileWriter("C:\\Users\\santhu\\Desktop\\RFP Assignments\\JavaRegexPrograms\\src\\com\\bridgelabz\\EmailResults"));
		
		
		for (String line : lines) {
			
			if (Pattern.matches(pattern, line)) {
				
				System.out.println("EMAIL ID --> " + line + " --> VALID EMAILId");
				writer.write("EMAIL ID --> " + line + " --> VALID EMAILId \n");
			}
			else {
				System.out.println("EMAIL ID --> " + line + " --> INVALID EMAILId");
				writer.write("EMAIL ID --> " + line + " --> INVALID EMAILId \n");
			}
		}
		writer.close();
	}
	
}
