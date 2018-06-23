package com.cinema.service;

import java.util.List;

import com.cinema.entity.UserInfoEntity;

public interface UserInfoService {

	void save(UserInfoEntity userInfo);
	
	UserInfoEntity findById(Long id);
		
	List<UserInfoEntity> findAll();
}
