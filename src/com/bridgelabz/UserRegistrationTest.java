package com.bridgelabz;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class UserRegistrationTest {
	static UserRegistration userRegistration;
	@BeforeClass
	public static void init() {
		userRegistration = new UserRegistration();
	}
	@Test
	public void ifUserRegistration_FirstName_StartsWithUpperCase_Then_itis_True(){
		boolean actualResult = userRegistration.userFirstName("Santhoshi");
		assertEquals(true, actualResult);
	}
	@Test
	public void ifUserRegistration_FirstName_if_it_doesnot_StartsWithUpperCase_Then_itis_False() {
		boolean actualResult = userRegistration.userFirstName("santhu");
		assertEquals(false,actualResult);
	}
	
	@Test
	public void ifUserRegistration_LastName_StartsWithUpperCase_Then_itis_True(){
		boolean actualResult = userRegistration.userLastName("Badam");
		assertEquals(true, actualResult);
	}
	@Test
	public void ifUserRegistration_LastName_StartsWithUpperCase_Then_itis_False() {
		boolean actualResult = userRegistration.userLastName("badam");
		assertEquals(false,actualResult);
	}
	
	@Test
	public void ifUserRegistration_Emailid_pattern_is_True(){
		boolean actualResult = userRegistration.userEmailId("abc.xyz@bridgelabz.co.in");
		assertEquals(true, actualResult);
	}
	
	@Test
	public void ifUserRegistration_Emailid_pattern_is_False() {
		boolean actualResult = userRegistration.userEmailId("abc123@.com");
		assertEquals(false,actualResult);
	}
	
	@Test
	public void ifUserRegistration_PhoneNumber_pattern_should_start_with_code_is_True() {
		boolean actualResult = userRegistration.userPhoneNumber("91 9987654321");
		assertEquals(true,actualResult);
	}
	
	@Test
	public void ifUserRegistration_PhoneNumber_pattern_should_start_with_code_if_not_itis_False() {
		boolean actualResult = userRegistration.userPhoneNumber("9987654321");
		assertEquals(false,actualResult);
	}
	
	@Test
	public void ifUserRegistration_PasswordRule1_pattern_is_True() {
		boolean actualResult = userRegistration.userPasswordRule1("santhoshi");
		assertEquals(true,actualResult);
	}
	
	@Test
	public void ifUserRegistration_PasswordRule1_pattern_is_False() {
		boolean actualResult = userRegistration.userPasswordRule1("santhu");
		assertEquals(false,actualResult);
	}
	
	@Test
	public void ifUserRegistration_PasswordRule2_pattern_is_True() {
		boolean actualResult = userRegistration.userPasswordRule2("Santhoshi");
		assertEquals(true,actualResult);
	}
	
	@Test
	public void ifUserRegistration_PasswordRule2_pattern_is_False() {
		boolean actualResult = userRegistration.userPasswordRule2("santhoshi");
		assertEquals(false,actualResult);
	}
	@Test
	public void ifUserRegistration_PasswordRule3_pattern_is_True() {
		boolean actualResult = userRegistration.userPasswordRule3("Santhoshi1");
		assertEquals(true,actualResult);
	}
	
	@Test
	public void ifUserRegistration_PasswordRule3_pattern_is_False() {
		boolean actualResult = userRegistration.userPasswordRule3("Santhoshi");
		assertEquals(false,actualResult);
	}
	
	@Test
	public void ifUserRegistration_PasswordRule4_pattern_is_True() {
		boolean actualResult = userRegistration.userPasswordRule4("Santhu@12");
		assertEquals(true,actualResult);
	}
	
	@Test
	public void ifUserRegistration_PasswordRule4_pattern_is_False() {
		boolean actualResult = userRegistration.userPasswordRule4("Santhu12");
		assertEquals(false,actualResult);
	}
	
}
