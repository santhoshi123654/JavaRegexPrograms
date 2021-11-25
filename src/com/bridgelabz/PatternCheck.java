package com.bridgelabz;

import java.util.regex.Pattern;

public class PatternCheck {
	public static boolean firstName(String fName) {

		String pattern = "^[A-Z]{1}[a-z]{2,}";
		if (Pattern.matches(pattern, fName)) {
			System.out.println("Valid");
		}
		else {
		System.out.println("Invalid");
		}
		return false;
	}
}
