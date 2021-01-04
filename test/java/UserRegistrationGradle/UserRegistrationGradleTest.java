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
		boolean mobileUserInput = userRegistrationGradle.UC5toUC8("Komal");
		//Assert Statement
		assertEquals(true, "passwordUserInput");
	}
	
	public static void UC6PasswordRule2() {
		UserRegistrationGradle userRegistrationGradle = new UserRegistrationGradle();
		boolean mobileUserInput = userRegistrationGradle.UC5toUC8("Komal");
		//Assert Statement
		assertEquals(true, "passwordUserInput");
	}
	
	public static void UC7PasswordRule3() {
		UserRegistrationGradle userRegistrationGradle = new UserRegistrationGradle();
		boolean mobileUserInput = userRegistrationGradle.UC5toUC8("Komal");
		//Assert Statement
		assertEquals(true, "passwordUserInput");
	}
	
	public static void UC8PasswordRule4() {
		UserRegistrationGradle userRegistrationGradle = new UserRegistrationGradle();
		boolean mobileUserInput = userRegistrationGradle.UC5toUC8("Komal");
		//Assert Statement
		assertEquals(true, "passwordUserInput");
	}
	
}
