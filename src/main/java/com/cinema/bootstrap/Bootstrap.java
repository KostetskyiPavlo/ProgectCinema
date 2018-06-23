package com.cinema.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.cinema.entity.UserEntity;
import com.cinema.entity.enums.UserRole;
import com.cinema.repository.UserRepository;

@Component
public class Bootstrap implements CommandLineRunner {

	@Autowired private UserRepository userRepository;
	@Autowired private PasswordEncoder passwordEncode;
	
	@Override
	public void run(String... args) throws Exception {
		
		if(userRepository.count() == 0) {
			UserEntity userAdmin = UserEntity.builder()
					.email("admin@admin")
					.password(passwordEncode.encode("123"))
					.role(UserRole.ROLE_ADMIN).build();

			userRepository.save(userAdmin);
		}
	}

}
