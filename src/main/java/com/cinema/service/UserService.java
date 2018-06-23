package com.cinema.service;

import java.util.List;

import com.cinema.entity.UserEntity;


public interface UserService {

	void save(UserEntity user);
	
	UserEntity findById(Long id);
	
	UserEntity findByEmail(String email);
	
	List<UserEntity> findAll();
}
