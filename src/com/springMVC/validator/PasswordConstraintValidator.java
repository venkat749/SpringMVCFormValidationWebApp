package com.springMVC.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PasswordConstraintValidator implements ConstraintValidator<isValidPassword, String>{

	private Pattern pattern;
	private Matcher matcher;
	private static final String PASSWORD_PATTERN = "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,20})";
	@SuppressWarnings("static-access")
	public PasswordConstraintValidator() {
		pattern = pattern.compile(PASSWORD_PATTERN);
	}

	@Override
	public void initialize(isValidPassword validPassword) {
		validPassword.message();
	}
	
	@Override
	public boolean isValid(String password, ConstraintValidatorContext arg1) {
		if(password == null)
		return false;
		else
//			matcher = pattern.matcher(password);
//			return matcher.matches();
			return pattern.matcher(password).matches();
	}

}
