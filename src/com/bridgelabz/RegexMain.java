package com.bridgelabz;

import java.util.regex.Pattern;
import java.util.Scanner;

public class RegexMain {
	public static void main(String[] args) {

		PatternCheck patterncheck = new PatternCheck();
		patterncheck.firstName();
		patterncheck.lastName();
		patterncheck.emailIdPattern();
		patterncheck.phoneNumberPattern();
	}
}