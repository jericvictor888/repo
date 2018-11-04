package com.random.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import com.random.annotation.Custom;

public class CustomValidator implements ConstraintValidator<Custom, String>{
	@Override
	public void initialize(Custom constraintAnnotation) {
		/**
		 * Do nothing
		 */
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		if(value.equalsIgnoreCase("custom")) {
			return true;
		}else {
			context.disableDefaultConstraintViolation();
			context.buildConstraintViolationWithTemplate("custom attribute value is incorrect")
				   .addConstraintViolation();
			return false;
		}
		
	}
}
