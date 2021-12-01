package com.bridgelabz;

import static org.junit.Assert.assertEquals;

import javax.naming.InvalidNameException;

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
		boolean actualResult = true;
		try {
			actualResult = userRegistration.userFirstName("Santhoshi");
		} catch (InvalidUserRegistrationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			assertEquals(true, actualResult);
		}
	
	}
	@Test
	public void ifUserRegistration_FirstName_if_it_doesnot_StartsWithUpperCase_Then_itis_False() {
		boolean actualResult = false;
		try {
			actualResult = userRegistration.userFirstName("santhu");
		} catch (InvalidUserRegistrationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		assertEquals(false,actualResult);
	}
	
	@Test
	public void ifUserRegistration_LastName_StartsWithUpperCase_Then_itis_True() {
		boolean actualResult = true;
		try {
			actualResult = userRegistration.userLastName("Badam");
		} catch (InvalidUserRegistrationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		assertEquals(true, actualResult);
	}
	
	@Test
	public void ifUserRegistration_LastName_StartsWithUpperCase_Then_itis_False() {
		boolean actualResult=false;
		try {
			actualResult = userRegistration.userLastName("badam");
		} catch (InvalidUserRegistrationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(false,actualResult);
	}
	
	@Test
	public void ifUserRegistration_Emailid_pattern_is_True(){
		boolean actualResult= true;
		try {
			actualResult = userRegistration.userEmailId("abc.xyz@bridgelabz.co.in");
		} catch (InvalidUserRegistrationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(true, actualResult);
	}
	
	@Test
	public void ifUserRegistration_Emailid_pattern_is_False() {
		boolean actualResult = false;
		try {
			actualResult = userRegistration.userEmailId("abc123@.com");
		} catch (InvalidUserRegistrationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(false,actualResult);
	}
	
	@Test
	public void ifUserRegistration_PhoneNumber_pattern_should_start_with_code_is_True() {
		boolean actualResult = true;
		try {
			actualResult = userRegistration.userPhoneNumber("91 9987654321");
		} catch (InvalidUserRegistrationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(true,actualResult);
	}
	
	@Test
	public void ifUserRegistration_PhoneNumber_pattern_should_start_with_code_if_not_itis_False() {
		boolean actualResult = false;
		try {
			actualResult = userRegistration.userPhoneNumber("9987654321");
		} catch (InvalidUserRegistrationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(false,actualResult);
	}
	
	@Test
	public void ifUserRegistration_PasswordRule1_pattern_is_True() {
		boolean actualResult = true;
		try {
			actualResult = userRegistration.userPasswordRule1("santhoshi");
		} catch (InvalidUserRegistrationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(true,actualResult);
	}
	
	@Test
	public void ifUserRegistration_PasswordRule1_pattern_is_False() {
		boolean actualResult = false;
		try {
			actualResult = userRegistration.userPasswordRule1("santhu");
		} catch (InvalidUserRegistrationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(false,actualResult);
	}
	
	@Test
	public void ifUserRegistration_PasswordRule2_pattern_is_True() {
		boolean actualResult = true;
		try {
			actualResult = userRegistration.userPasswordRule2("Santhoshi");
		} catch (InvalidUserRegistrationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(true,actualResult);
	}
	
	@Test
	public void ifUserRegistration_PasswordRule2_pattern_is_False() {
		boolean actualResult = false;
		try {
			actualResult = userRegistration.userPasswordRule2("santhoshi");
		} catch (InvalidUserRegistrationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(false,actualResult);
	}
	@Test
	public void ifUserRegistration_PasswordRule3_pattern_is_True() {
		boolean actualResult = true;
		try {
			actualResult = userRegistration.userPasswordRule3("Santhoshi1");
		} catch (InvalidUserRegistrationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(true,actualResult);
	}
	
	@Test
	public void ifUserRegistration_PasswordRule3_pattern_is_False() {
		boolean actualResult = false;
		try {
			actualResult = userRegistration.userPasswordRule3("Santhoshi");
		} catch (InvalidUserRegistrationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(false,actualResult);
	}
	
	@Test
	public void ifUserRegistration_PasswordRule4_pattern_is_True() {
		boolean actualResult = true;
		try {
			actualResult = userRegistration.userPasswordRule4("Santhu@12");
		} catch (InvalidUserRegistrationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(true,actualResult);
	}
	
	@Test
	public void ifUserRegistration_PasswordRule4_pattern_is_False() {
		boolean actualResult = false;
		try {
			actualResult = userRegistration.userPasswordRule4("Santhu12");
		} catch (InvalidUserRegistrationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(false,actualResult);
	}
	
}
