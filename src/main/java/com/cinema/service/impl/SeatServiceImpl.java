package com.cinema.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cinema.entity.Seat;
import com.cinema.repository.SeatRepository;
import com.cinema.service.SeatService;

@Service
public class SeatServiceImpl implements SeatService {

	@Autowired private SeatRepository seatRepository;

	@Override
	public void save(Seat seat) {
		seatRepository.save(seat);
	}

	@Override
	public Seat findById(Long id) {
		return seatRepository.getOne(id);
	}

	@Override
	public List<Seat> findAll() {
		return seatRepository.findAll();
	}

}
