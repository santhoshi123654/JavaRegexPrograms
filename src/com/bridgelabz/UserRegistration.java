package com.bridgelabz;

public class UserRegistration {
	
	String firstName;
	String LastName;
	String phoneNumber;
	String emailId;
	String password;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String geteMail() {
		return emailId;
	}

	public void seteMail(String email) {
		this.emailId = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "UserRegistration [firstName=" + firstName + ", LastName=" + LastName + ", phoneNumber=" + phoneNumber
				+ ", emailId=" + emailId + ", password=" + password + "]";
	}
}