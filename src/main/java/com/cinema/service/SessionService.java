package com.cinema.service;

import java.util.List;

import com.cinema.entity.Session;

public interface SessionService {

	void save(Session session);
	
	Session findById(Long id);
		
	List<Session> findAll();
}
