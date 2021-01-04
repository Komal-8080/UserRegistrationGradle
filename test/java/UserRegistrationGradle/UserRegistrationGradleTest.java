package UserRegistrationGradle;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Scanner;

public class UserRegistrationGradleTest {
	
	public static void UC1() {
		UserRegistrationGradle userRegistrationGradle = new UserRegistrationGradle();
		boolean firstNameUserInput = userRegistrationGradle.UC1("Komal");
		//Assert Statement
		assertEquals(true, "firstNameUserInput");
	}
	
	public static void UC2() {
		UserRegistrationGradle userRegistrationGradle = new UserRegistrationGradle();
		boolean lastNameUserInput = userRegistrationGradle.UC2("Shinde");
		//Assert Statement
		assertEquals(true, "lastNameUserInput");
	}
	
	public static void UC3() {
		UserRegistrationGradle userRegistrationGradle = new UserRegistrationGradle();
		boolean emailUserInput = userRegistrationGradle.UC3("abc.xyz@bl.co.in");
		//Assert Statement
		assertEquals(true, "emailUserInput");
	}
	
	public static void UC4() {
		UserRegistrationGradle userRegistrationGradle = new UserRegistrationGradle();
		boolean mobileUserInput = userRegistrationGradle.UC4("91 8562416354");
		//Assert Statement
		assertEquals(true, "mobileUserInput");
	}
	
	public static void UC5PasswordRule1() {
		UserRegistrationGradle userRegistrationGradle = new UserRegistrationGradle();
		boolean passwordUserInput = userRegistrationGradle.UC5toUC8("Komal");
		//Assert Statement
		assertEquals(true, "passwordUserInput");
	}
	
	public static void UC6PasswordRule2() {
		UserRegistrationGradle userRegistrationGradle = new UserRegistrationGradle();
		boolean passwordUserInput = userRegistrationGradle.UC5toUC8("Komal");
		//Assert Statement
		assertEquals(true, "passwordUserInput");
	}
	
	public static void UC7PasswordRule3() {
		UserRegistrationGradle userRegistrationGradle = new UserRegistrationGradle();
		boolean passwordUserInput = userRegistrationGradle.UC5toUC8("Komal");
		//Assert Statement
		assertEquals(true, "passwordUserInput");
	}
	
	public static void UC8PasswordRule4() {
		UserRegistrationGradle userRegistrationGradle = new UserRegistrationGradle();
		boolean passwordUserInput = userRegistrationGradle.UC5toUC8("Komal");
		//Assert Statement
		assertEquals(true, "passwordUserInput");
	}
	
	public static void UC9() {
		UserRegistrationGradle userRegistrationGradle = new UserRegistrationGradle();
		boolean sampleEmailValidation1 = userRegistrationGradle.UC9("abc@yahoo.com");
		boolean sampleEmailValidation2 = userRegistrationGradle.UC9("abc-100@yahoo.com");
		boolean sampleEmailValidation3 = userRegistrationGradle.UC9("abc.100@yahoo.com");
		boolean sampleEmailValidation4 = userRegistrationGradle.UC9("abc111@abc.com");
		boolean sampleEmailValidation5 = userRegistrationGradle.UC9("abc-100@abc.net");
		boolean sampleEmailValidation6 = userRegistrationGradle.UC9("abc.100@abc.com.au");
		boolean sampleEmailValidation7 = userRegistrationGradle.UC9("abc@1.com");
		boolean sampleEmailValidation8 = userRegistrationGradle.UC9("abc@gmail.com.com");
		boolean sampleEmailValidation9 = userRegistrationGradle.UC9("abc+100@gmail.com");
		//Assert Statement
				assertEquals(true, "sampleEmailValidation1");
				assertEquals(true, "sampleEmailValidation2");
				assertEquals(true, "sampleEmailValidation3");
				assertEquals(true, "sampleEmailValidation4");
				assertEquals(true, "sampleEmailValidation5");
				assertEquals(true, "sampleEmailValidation6");
				assertEquals(true, "sampleEmailValidation7");
				assertEquals(true, "sampleEmailValidation8");
				assertEquals(true, "sampleEmailValidation9");				
	}
	
}
