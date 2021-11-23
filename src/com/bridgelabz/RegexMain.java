package com.bridgelabz;
import java.util.regex.Pattern;
import java.util.Scanner;

public class RegexMain {
	
	public static void main(String[] args) {
	
	String pattern = "^([a-z]){3}[.][(a-z)]{2,}+@[(a-z)]{2}[.][(a-z)]{2}[.][(a-z)]{2,}$";
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Email Id :");
	String emailId1 = sc.nextLine();
	System.out.println(Pattern.matches(pattern, emailId1));
	String emailId = "abc.xyz@bl.co.in";
	System.out.println(Pattern.matches(pattern, emailId));
	
	}
}
