package com.cinema.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cinema.entity.Movie;
import com.cinema.repository.MovieRepository;
import com.cinema.service.MovieService;

@Service
public class MovieServiceImpl implements MovieService {

	@Autowired private MovieRepository movieRepository;

	@Override
	public void save(Movie movie) {
		movieRepository.save(movie);
	}

	@Override
	public Movie findById(Long id) {
		return movieRepository.getOne(id);
	}

	@Override
	public List<Movie> findAll() {
		return movieRepository.findAll();
	}

}
