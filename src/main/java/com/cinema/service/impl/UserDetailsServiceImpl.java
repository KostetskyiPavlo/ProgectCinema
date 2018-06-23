package com.cinema.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.cinema.entity.UserEntity;
import com.cinema.mapper.UserMapper;
import com.cinema.repository.UserRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService{

	@Autowired private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		UserEntity user = userRepository.findUserByEmail(email);
		if(user == null) {
			throw new UsernameNotFoundException("User with " + email + " not found");
		}
		return UserMapper.toSecurityUser(user);
	}
}
