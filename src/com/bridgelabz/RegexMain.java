package com.bridgelabz;
import java.util.regex.Pattern;
import java.util.Scanner;

public class RegexMain {
	public static void main(String[] args) {
	
	String pattern = "^([A-Za-z]){3,}$";
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the First Name :");
	String fName = sc.nextLine();
	System.out.println(Pattern.matches(pattern, fName));
	
	}
}
