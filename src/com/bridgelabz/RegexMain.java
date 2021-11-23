package com.bridgelabz;
import java.util.regex.Pattern;
import java.util.Scanner;

public class RegexMain {
	
	public static void main(String[] args) {
	
		String pattern = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$!%^&*?]).{8,}$";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Password :");
		String passwordRule4 = sc.nextLine();
		System.out.println(Pattern.matches(pattern, passwordRule4));
	}
}