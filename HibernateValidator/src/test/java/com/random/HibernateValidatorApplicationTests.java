package com.random;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import java.util.Set;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.random.domain.Vehicle;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class HibernateValidatorApplicationTests {
	private static Validator validator;
	
	@BeforeClass
	public static void setUp() {
		validator = Validation.buildDefaultValidatorFactory().getValidator();
	}

	@Test
	public void ValidateThatAttributeIsNull() {	
		Vehicle car = new Vehicle(null, "custom");
		Set<ConstraintViolation<Vehicle>> constraintViolations = validator.validate(car);
		assertEquals(1, constraintViolations.size());
		assertEquals("color must not be null", constraintViolations.stream().findFirst().get().getMessage());
	}
	
	@Test
	public void CustomValidatorTestPositive() {
		Vehicle car = new Vehicle("red", "custom");   //correct custom value
		Set<ConstraintViolation<Vehicle>> constraintViolation = validator.validate(car);
		if(constraintViolation.size()>0) {
			fail();
		}
	}
	
	@Test 
	public void CustomValidatorTestNegative() {
		Vehicle car = new Vehicle("blue", "other"); //Incorrect custom value
		Set<ConstraintViolation<Vehicle>> constraintViolation = validator.validate(car);
		assertEquals("custom attribute value is incorrect", 
				constraintViolation.stream().findFirst().get().getMessage());
	}
	
	@Test
	public void InheritanceValidation() {
		
	}
	
}
