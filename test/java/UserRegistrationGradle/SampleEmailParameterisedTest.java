package UserRegistrationGradle;

import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class SampleEmailParameterisedTest {
	
	private String emailCheck;
	private boolean expectedOutput;
	private UserRegistrationGradle validation;

	@Before
	public void intialize() {
		validation = new UserRegistrationGradle();
	}

	public SampleEmailParameterisedTest(String emailCheck, boolean expectedOutput) {
		this.emailCheck = emailCheck;
		this.expectedOutput = expectedOutput;
	}

	@Parameters
	public static Collection data() {
		return Arrays.asList(new Object[][] { { "abc@yahoo.com", true }, { "abc-100@yahoo.com", true },
				{ "abc.100@yahoo.com", true }, { "abc111@abc.com", true }, { "abc-100@abc.net", true },
				{ "abc.100@abc.com.au", true }, { "abc@1.com", true }, { "abc@gmail.com.com", true },
				{ "abc+100@gmail.com", true }, });

	}

	@Test
	public void UC11() {
		// Assert Statement
		assertEquals(expectedOutput, validation.UC9(emailCheck));
	}
}
