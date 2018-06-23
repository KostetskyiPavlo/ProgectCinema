package com.cinema.service;

import java.util.List;

import com.cinema.entity.Seat;

public interface SeatService {

	void save(Seat seat);
	
	Seat findById(Long id);
		
	List<Seat> findAll();
}
