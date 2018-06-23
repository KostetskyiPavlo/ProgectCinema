package com.cinema.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.stereotype.Component;

import com.cinema.dto.UserDTO;

@Component
public class CheckPasswordValidator implements ConstraintValidator<CheckUserEmailExists, UserDTO>{

	
	@Override
	public boolean isValid(UserDTO user, ConstraintValidatorContext context) {
		
		if(user.getPassword().equals(user.getPasswordConfirm())) 
			return true;
		
		return false;
	}

}
