package UserRegistrationGradle;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Scanner;

public class UserRegistrationGradleTest {

	@Test
	public void UC1() {
		try {
			try {
				UserRegistrationGradle userRegistrationGradle = new UserRegistrationGradle();
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter FirstName");
				String fName = sc.nextLine();
				boolean firstNameUserInput = userRegistrationGradle.UC1(fName);
				Assert.assertTrue(firstNameUserInput);
			} catch (NullPointerException e) {
				e.printStackTrace();
			}
		} catch (InvalidInputException e)

		{
			e.printStackTrace();
		}
	}

	@Test
	public void UC2() {
		try {
			try {
				UserRegistrationGradle userRegistrationGradle = new UserRegistrationGradle();
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter LastName");
				String lName = sc.nextLine();
				boolean lastNameUserInput = userRegistrationGradle.UC2(lName);
				Assert.assertTrue(lastNameUserInput);
			} catch (NullPointerException e) {
				e.printStackTrace();
			}
		} catch (InvalidInputException e)

		{
			e.printStackTrace();
		}
	}

	@Test
	public void UC3() {

		try {
			try {
				UserRegistrationGradle userRegistrationGradle = new UserRegistrationGradle();
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter Email");
				String email = sc.nextLine();
				boolean emailUserInput = userRegistrationGradle.UC3(email);
				Assert.assertTrue(emailUserInput);
			} catch (NullPointerException e) {
				e.printStackTrace();
			}
		} catch (InvalidInputException e)

		{
			e.printStackTrace();
		}
	}

	@Test
	public void UC4() {

		try {
			try {
				UserRegistrationGradle userRegistrationGradle = new UserRegistrationGradle();
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter Mobile Number");
				String mobile = sc.nextLine();
				boolean mobileUserInput = userRegistrationGradle.UC4(mobile);
				Assert.assertTrue(mobileUserInput);
			} catch (NullPointerException e) {
				e.printStackTrace();
			}
		} catch (InvalidInputException e)

		{
			e.printStackTrace();
		}
	}

	@Test
	public void UC5PasswordRule1() {

		try {
			try {
				UserRegistrationGradle userRegistrationGradle = new UserRegistrationGradle();
				boolean passwordUserInput = userRegistrationGradle.UC5toUC8("Komal@80");
				Assert.assertTrue(passwordUserInput);
			} catch (NullPointerException e) {
				e.printStackTrace();
			}
		} catch (InvalidInputException e)

		{
			e.printStackTrace();
		}
	}

	@Test
	public void UC6PasswordRule2() {
		try {
			try {
				UserRegistrationGradle userRegistrationGradle = new UserRegistrationGradle();
				boolean passwordUserInput = userRegistrationGradle.UC5toUC8("Komal@80");
				Assert.assertTrue(passwordUserInput);
			} catch (NullPointerException e) {
				e.printStackTrace();
			}
		} catch (InvalidInputException e)

		{
			e.printStackTrace();
		}
	}

	@Test
	public void UC7PasswordRule3() {
		try {
			try {
				UserRegistrationGradle userRegistrationGradle = new UserRegistrationGradle();
				boolean passwordUserInput = userRegistrationGradle.UC5toUC8("Komal@80");
				Assert.assertTrue(passwordUserInput);
			} catch (NullPointerException e) {
				e.printStackTrace();
			}
		} catch (InvalidInputException e)

		{
			e.printStackTrace();
		}
	}

	@Test
	public void UC8PasswordRule4() {

		try {
			try {
				UserRegistrationGradle userRegistrationGradle = new UserRegistrationGradle();
				boolean passwordUserInput = userRegistrationGradle.UC5toUC8("Komal@10");
				Assert.assertTrue(passwordUserInput);
			} catch (NullPointerException e) {
				e.printStackTrace();
			}
		} catch (InvalidInputException e)

		{
			e.printStackTrace();
		}
	}

	@Test
	public void UC9() {

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
		// Assert Statement
		Assert.assertTrue(sampleEmailValidation1);
		Assert.assertTrue(sampleEmailValidation2);
		Assert.assertTrue(sampleEmailValidation3);
		Assert.assertTrue(sampleEmailValidation4);
		Assert.assertTrue(sampleEmailValidation5);
		Assert.assertTrue(sampleEmailValidation6);
		Assert.assertTrue(sampleEmailValidation7);
		Assert.assertTrue(sampleEmailValidation8);
		Assert.assertTrue(sampleEmailValidation9);
	}

}
