package com.bridgelabz;

import java.util.regex.Pattern;
import java.util.Scanner;

public class RegexMain {
	
	public static void main(String[] args) {
	
	String pattern = "^([A-Z]){1}([a-z]){2,}$";
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Last Name :");
	String lName = sc.nextLine();
	System.out.println(Pattern.matches(pattern, lName));
	
	}
}
