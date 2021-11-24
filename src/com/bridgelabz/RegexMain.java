package com.bridgelabz;
import java.util.regex.Pattern;
import java.io.IOException;
import java.util.Scanner;

public class RegexMain {
	
	public static void main(String[] args) throws IOException {

		PatternCheck check = new PatternCheck();
		check.firstNamePattern();
		check.lastNamePattern();
		check.emailIdPattern();
		check.phoneNumber();
		check.passwordPattern();
		check.emailsSampleChecking();;
		check.printResult();
	}
}