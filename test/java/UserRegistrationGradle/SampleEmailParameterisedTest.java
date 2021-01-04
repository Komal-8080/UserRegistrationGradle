package UserRegistrationGradle;

import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import static org.junit.Assert.*;

public class SampleEmailParameterisedTest {
	private String emailCheck;
	private boolean expectedOutput;
	
		public SampleEmailParameterisedTest(String emailCheck, boolean expectedOutput) {
			this.emailCheck = emailCheck;
			this.expectedOutput = expectedOutput;
		}
	
		public static Collection data() {
			return Arrays.asList(new Object[][] { {"abc@yahoo.com", true},
													{"abc-100@yahoo.com", true},
													{"abc.100@yahoo.com", true},
													{"abc111@abc.com", true},
													{"abc-100@abc.net", true},
													{"abc.100@abc.com.au", true},
													{"abc@1.com", true},
													{"abc@gmail.com.com", true},
													{"abc+100@gmail.com", true},});
												
		}
		
		public void UC11() {
			UserRegistrationGradle userRegistrationGradle = new UserRegistrationGradle();
			boolean sampleEmailValidation = userRegistrationGradle.UC9(this.emailCheck);
			//Assert Statement
			assertEquals(this.expectedOutput, "sampleEmailValidation");
		}
}
