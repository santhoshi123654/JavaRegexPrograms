package com.lamdaExpressions;

public class UserDetails {
	
	String firstName;
	String LastName;
	String phoneNumber;
	String emailId;
	String password;
	
	public static UserDetails instance;
	
	
	public UserDetails(String firstName, String lastName, String phoneNumber, String emailId, String password) {
		super();
		this.firstName = firstName;
		this.LastName = lastName;
		this.phoneNumber = phoneNumber;
		this.emailId = emailId;
		this.password = password;
	}
	public UserDetails() {
		// TODO Auto-generated constructor stub
	}
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
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "UserDetails [firstName=" + firstName + ", LastName=" + LastName + ", phoneNumber=" + phoneNumber
				+ ", emailId=" + emailId + ", password=" + password + "]";
	}

	public static UserDetails getInstance() {
		// TODO Auto-generated method stub
		return null;
	}

}
