package com.cinema.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cinema.entity.UserInfoEntity;
import com.cinema.repository.UserInfoRepository;
import com.cinema.service.UserInfoService;

@Service
public class UserInfoServiceImpl implements UserInfoService {


	@Autowired private UserInfoRepository userInfoRepository;
	
	@Override
	public void save(UserInfoEntity userInfo) {
		userInfoRepository.save(userInfo);
	}

	@Override
	public UserInfoEntity findById(Long id) {
		return userInfoRepository.getOne(id);
	}

	@Override
	public List<UserInfoEntity> findAll() {
		return userInfoRepository.findAll();
	}

}
