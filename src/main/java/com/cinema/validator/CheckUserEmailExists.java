package com.cinema.validator;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Retention(RUNTIME)
@Target({ FIELD, METHOD })
@Constraint(validatedBy = CheckUserEmailExistsValidator.class)
public @interface CheckUserEmailExists {

	String message() default "User with such email is already exists";
	Class<?>[] groups() default {};
	Class<? extends Payload>[] payload() default {};
}
