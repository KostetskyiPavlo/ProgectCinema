package com.cinema.service;

import java.util.List;

import com.cinema.entity.Hall;

public interface HallService {

	void save(Hall hall);
	
	Hall findById(Long id);
		
	List<Hall> findAll();
}
