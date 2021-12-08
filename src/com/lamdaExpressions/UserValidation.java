package com.lamdaExpressions;

import java.util.Scanner;

import com.lamdaExpressions.InvalidUserRegistrationException.Invalid;

public class UserValidation {
	
	public static UserValidation instance;
	public static final String NAME_PATTERN = "^([A-Z]{1}+[a-z]{2,})*$";
	public static final String PHONE_NUMBER_PATTERN = "^([0-9]{1,2})\\s([0-9]{10})$";
	public static final String PASSWORD_PATTERN = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()]+)(?=\\S+$).{8,}$";
	public static final String EMAIL_PATTERN = "^[a-zA-Z0-9]+([-_+.a-zA-Z0-9])*@[A-Za-z]+.[A-Za-z]+(.[A-Za-z]{2})*$";

	Scanner sc = new Scanner(System.in);

	UserValidation() {

	}

	void UserEntry() {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		String output = "";
		do {
			System.out
					.println("Check for vaild or not \n1.First Name\n2.Last Name\n3.Email\n4.Password\n5.Phone Number");
			i = sc.nextInt();
			System.out.println("Enter the value to check");
			UserDetails userDetails = new UserDetails();
			String input = sc.next();
			switch (i) {
			case 1:
				IUserRegistration firstName = (String text) -> {
					try {
						boolean check = text.matches(UserValidation.NAME_PATTERN);
						if (check == true) {
							userDetails.setFirstName(input);
							return "valid";
						}
						throw new InvalidUserRegistrationException(Invalid.FirstName, "First Name invalid format");

					} catch (InvalidUserRegistrationException e) {
						e.printStackTrace();
					}
					return "invalid";
				};
				output = firstName.userEntry(input);
				System.out.println(firstName.userEntry(input));
				break;
			case 2:
				IUserRegistration lastName = (String text) -> {
					try {
						boolean check = input.matches(UserValidation.NAME_PATTERN);
						if (check == true) {
							userDetails.setLastName(input);
							return "valid";
						}
						throw new InvalidUserRegistrationException(Invalid.LastName, "Last Name invalid format");

					} catch (InvalidUserRegistrationException e) {

					}
					return "invalid";
				};
				output = lastName.userEntry(input);
				System.out.println(lastName.userEntry(input));
				break;
			case 3:

				IUserRegistration email = (String text) -> {
					try {
						boolean check = input.matches(UserValidation.EMAIL_PATTERN);
						if (check == true) {
							userDetails.setEmailId(input);
							return "valid";
						}
						throw new InvalidUserRegistrationException(Invalid.EmailId, "Email invalid format");

					} catch (InvalidUserRegistrationException e) {
						e.printStackTrace();
					}
					return "invalid";
				};
				output = email.userEntry(input);
				System.out.println(email.userEntry(input));
				break;
			case 4:
				IUserRegistration password = (String text) -> {
					try {
						boolean check = input.matches(UserValidation.PASSWORD_PATTERN);
						if (check == true) {
							userDetails.setPassword(input);
							return "valid";
						}
						throw new InvalidUserRegistrationException(Invalid.Password, "password invalid format");

					} catch (InvalidUserRegistrationException e) {
						e.printStackTrace();
					}
					return "invalid";
				};
				output = password.userEntry(input);
				System.out.println(output);
				break;
			case 5:
				IUserRegistration phoneNumber = (String text) -> {
					try {
						boolean check = input.matches(UserValidation.PHONE_NUMBER_PATTERN);
						if (check == true) {
							userDetails.setPhoneNumber(input);
							return "valid";
						}
						throw new InvalidUserRegistrationException(Invalid.PhoneNumber, "phone number invalid format");

					} catch (InvalidUserRegistrationException e) {
						e.printStackTrace();
					}
					return "invalid";
				};
				System.out.println(phoneNumber.userEntry(input));
				break;
			default:
				System.out.println("invalid in put");
			}
			if (output == "invalid" || output == "invalid in put") {
				i--;
			}
		} while (i > 0 || i <= 5);
		sc.close();

	}

	public static UserValidation getInstance() {
		if (instance == null) {
			instance = new UserValidation();
		}
		return instance;
	}

	public void addFirstName() {

		UserDetails userDetails = UserDetails.getInstance();
		System.out.print("Enter First Name : ");
		String fName = null;
		fName = sc.nextLine();
		userDetails.setFirstName(fName);
		boolean check = fName.matches(NAME_PATTERN);
		try {
			if (check == true) {
			}

			else {
				throw new InvalidUserRegistrationException(Invalid.FirstName, "Invalid First Name format");
			}
		} catch (InvalidUserRegistrationException e) {
			e.printStackTrace();
		}

	}

	public void addLastName() {
		UserDetails userDetails = UserDetails.getInstance();
		System.out.print("Enter Last Name : ");
		String lName = sc.nextLine();
		userDetails.setLastName(lName);
		boolean check = lName.matches(NAME_PATTERN);
		try {
			if (check == true) {
			}

			else {
				throw new InvalidUserRegistrationException(Invalid.LastName, "Invalid Last Name format");
			}
		} catch (InvalidUserRegistrationException e) {
			e.printStackTrace();
		}
	}

	public void addEmail() {
		UserDetails userDetails = UserDetails.getInstance();
		System.out.print("Enter Email : ");
		String email = sc.nextLine();
		userDetails.setEmailId(email);
		boolean check = email.matches(EMAIL_PATTERN);
		try {
			if (check == true) {
			}

			else {
				throw new InvalidUserRegistrationException(Invalid.EmailId, "Invalid Email Format");
			}
		} catch (InvalidUserRegistrationException e) {
			e.printStackTrace();
		}
	}
	public void addPhoneNumber() {
		UserDetails userDetails = UserDetails.getInstance();
		System.out.print("Enter Phone Number : ");
		String phoneNo = sc.nextLine();
		userDetails.setPhoneNumber(phoneNo);
		boolean check = phoneNo.matches(PHONE_NUMBER_PATTERN);
		try {
			if (check == true) {
			}

			else {
				throw new InvalidUserRegistrationException(Invalid.PhoneNumber, "Invalid Phone number Format");
			}
		} catch (InvalidUserRegistrationException e) {
			e.printStackTrace();
		}
	}

	public void addPassword() {
		UserDetails userDetails = UserDetails.getInstance();
		System.out.print("Enter Password : ");
		String password = sc.nextLine();
		userDetails.setPassword(password);
		boolean check = password.matches(PASSWORD_PATTERN);
		try {
			
			if (check == true) {
			}

			else {
				throw new InvalidUserRegistrationException(Invalid.Password, "Invalid ");
			}
		} catch (InvalidUserRegistrationException e) {
			e.printStackTrace();
		}
	}
}
