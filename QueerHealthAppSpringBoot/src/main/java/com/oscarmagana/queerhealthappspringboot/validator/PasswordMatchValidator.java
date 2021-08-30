package com.oscarmagana.queerhealthappspringboot.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.oscarmagana.queerhealthappspringboot.model.User;

public class PasswordMatchValidator implements ConstraintValidator<PasswordMatch,Object> {
	@Override
	public boolean isValid(final Object candidate, final ConstraintValidatorContext context) {
		User user = (User) candidate;
		return user.getPassword().equals(user.getPasswordConfirmation());
	}
}
