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
}
