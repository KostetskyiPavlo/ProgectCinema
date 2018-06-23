package com.cinema.service;

import java.util.List;

import com.cinema.entity.Movie;

public interface MovieService {

	void save(Movie movie);
	
	Movie findById(Long id);
		
	List<Movie> findAll();
}
