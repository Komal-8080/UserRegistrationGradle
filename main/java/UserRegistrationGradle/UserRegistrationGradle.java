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
	
	public static boolean UC2(String lastNameUserInput) {		
		Pattern lastName = Pattern.compile("[A-Z]{1}[a-z]{2,}$");  
		Matcher match = lastName.matcher(lastNameUserInput);  
		boolean patternValidity = match.matches();
		return patternValidity;	
	}
	
	public static boolean UC3(String emailUserInput) {
		Pattern email = Pattern.compile("^[a-zA-Z]{3}\\.[a-zA-Z]{1,}@[a-zA-Z]{2}\\.[a-zA-Z]{2}\\.[a-zA-Z]{1,}$");  
		Matcher match = email.matcher(emailUserInput);  
		boolean patternValidity = match.matches();
		return patternValidity;
	}

	public boolean UC4(String mobileUserInput) {
		Pattern mobileNumber = Pattern.compile("^[1-9]{2}\\s{1}[0-9]{1}[0-9]{9}$");  
		Matcher match = mobileNumber.matcher(mobileUserInput);  
		boolean patternValidity = match.matches();
		return patternValidity;
	}	
	
	public static boolean UC5toUC8(String passwordUserInput) {
		Pattern mobileNumber = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*])[a-zA-Z0-9!@#$%^&*]{8,}");  
		Matcher match = mobileNumber.matcher(passwordUserInput);  
		boolean patternValidity = match.matches();
		return patternValidity;
	}
	
}
