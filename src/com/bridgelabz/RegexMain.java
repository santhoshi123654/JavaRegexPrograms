package com.bridgelabz;
import java.util.regex.Pattern;
import java.util.Scanner;

public class RegexMain {
	
	public static void main(String[] args) {
	
	String pattern = "^([1-9]){2}\s[(0-9)]{10}$";
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the PhoneNumber :");
	String phoneNumber = sc.nextLine();
	System.out.println(Pattern.matches(pattern, phoneNumber));
	String mobileNum = "91 9919819801";
	System.out.println(Pattern.matches(pattern, mobileNum));
	
	}
}
