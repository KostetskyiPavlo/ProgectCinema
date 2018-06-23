package com.cinema.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.cinema.entity.UserEntity;
import com.cinema.repository.UserRepository;
import com.cinema.service.UserService;


@Service
public class UserServiceImpl implements UserService {

	@Autowired private UserRepository userRepository;
	@Autowired private PasswordEncoder passwordEncoder;
	
	@Override
	public void save(UserEntity user) {
		String password = user.getPassword();
		System.out.println("Entered password: " + password);
		
		user.setPassword(passwordEncoder.encode(password));
		
		System.out.println("Hash password: " + user.getPassword());
		userRepository.save(user);
	}

	@Override
	public UserEntity findById(Long id) {
		return userRepository.getOne(id);
	}

	@Override
	public UserEntity findByEmail(String email) {
		return userRepository.findUserByEmail(email);
	}

	@Override
	public List<UserEntity> findAll() {
		return userRepository.findAll();
	}

}
