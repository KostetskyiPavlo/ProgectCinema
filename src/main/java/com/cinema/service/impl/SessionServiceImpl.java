package com.cinema.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cinema.entity.Session;
import com.cinema.repository.SessionRepository;
import com.cinema.service.SessionService;

@Service
public class SessionServiceImpl implements SessionService {

	@Autowired private SessionRepository sessionRepository;

	@Override
	public void save(Session session) {
		sessionRepository.save(session);
	}

	@Override
	public Session findById(Long id) {
		return sessionRepository.getOne(id);
	}

	@Override
	public List<Session> findAll() {
		return sessionRepository.findAll();
	}

}
