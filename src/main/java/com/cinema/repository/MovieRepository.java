package com.cinema.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cinema.entity.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {

}
