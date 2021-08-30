package com.oscarmagana.queerhealthappspringboot.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;

import com.oscarmagana.queerhealthappspringboot.service.MainService;

public class UniqueEmailValidator implements ConstraintValidator<UniqueEmail, String> {
	@Autowired
	private MainService mainServ;
	@Override
	public boolean isValid(final String valueToCheck, final ConstraintValidatorContext context) {
		System.out.println("Value " + valueToCheck);
		try {
			boolean test = !mainServ.emailExists(valueToCheck);
			return test;	
			//keep getting null pointer exception on mainServ with new emails
		} catch(Exception e) {
			return true;
		}
	}

}
