package com.cinema.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;

import com.cinema.dto.UserDTO;
import com.cinema.entity.UserEntity;
import com.cinema.entity.enums.UserRole;

public class UserMapper {

	public static User toSecurityUser(UserEntity user) {
		return new User(
				user.getEmail(),
				user.getPassword(), 
				AuthorityUtils.createAuthorityList(String.valueOf(user.getRole())));
	}
	
//	public static com.logos.entity.User convertToUser(UserDTO userDTO){
//		return com.logos.entity.User
//				.builder()
//					.username(userDTO.getUsername())
//					.password(userDTO.getPassword())
//					.role(UserRole.ROLE_USER)
//				.build();
//	}

	public static UserDTO convertToDto(UserEntity user) {
		return new ModelMapper().map(user, UserDTO.class);
	}
	
	public static UserEntity convertToUser(UserDTO userDTO){
		UserEntity user = new ModelMapper().map(userDTO, UserEntity.class);
		user.setRole(UserRole.ROLE_USER);		
		return user;
	}
	
}
