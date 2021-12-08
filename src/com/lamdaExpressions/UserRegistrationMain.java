package com.lamdaExpressions;

import java.io.IOException;

import com.bridgelabz.InvalidUserRegistrationException;
import com.bridgelabz.PatternCheck;

public class UserRegistrationMain {
	
	public static void main(String[] args) throws InvalidUserRegistrationException, IOException {
	UserValidation userValidation = new UserValidation();
	userValidation.UserEntry();
	}
}
