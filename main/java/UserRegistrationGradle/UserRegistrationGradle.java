package UserRegistrationGradle;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationGradle {
	
	public static boolean UC1(String firstNameUserInput) {		
		Pattern firstName = Pattern.compile("[A-Z]{1}[a-z]{2,}$");  
		Matcher match = firstName.matcher(firstNameUserInput);  
		boolean patternValidity = match.matches();
		return patternValidity;		
	}
	
}
