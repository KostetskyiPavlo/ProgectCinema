package com.cinema.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cinema.entity.Seat;

@Repository
public interface SeatRepository extends JpaRepository<Seat, Long>  {

}
