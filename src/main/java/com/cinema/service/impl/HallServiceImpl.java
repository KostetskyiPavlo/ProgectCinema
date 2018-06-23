package com.cinema.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cinema.entity.Hall;
import com.cinema.repository.HallRepository;
import com.cinema.service.HallService;

@Service
public class HallServiceImpl implements HallService {

	@Autowired private HallRepository hallRepository;
	
	@Override
	public void save(Hall hall) {
		hallRepository.save(hall);
	}

	@Override
	public Hall findById(Long id) {
		return hallRepository.getOne(id);
	}

	@Override
	public List<Hall> findAll() {
		return hallRepository.findAll();
	}

}
