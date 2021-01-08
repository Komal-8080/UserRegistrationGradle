package UserRegistrationGradle;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {

	public static void main(String args[]) {
		Result result = JUnitCore.runClasses(SampleEmailParameterisedTest.class);

		for (Failure failure : result.getFailures()) {
			System.out.println(" " + failure.toString());

		}

		System.out.println("number of failures: " + result.getRunCount());
		System.out.println("passed cases: " + result.wasSuccessful());

	}

}
