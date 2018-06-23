package com.cinema.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cinema.entity.Hall;

@Repository
public interface HallRepository extends JpaRepository<Hall, Long> {

}
