package com.cinema.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.cinema.entity.enums.UserRole;
import com.cinema.validator.CheckUserEmailExists;
import com.cinema.validator.CheckPassword;

import lombok.Data;

@Data
@CheckPassword
public class UserDTO {

	@Email
	@CheckUserEmailExists
	@NotEmpty(message = "Field EMAIL cant be empty")
	private String email;

	@Size(min = 8, message = "PASSWORD should contain minimum 8 symbols")
	private String password;

	private String passwordConfirm;

	private UserRole role;
}
