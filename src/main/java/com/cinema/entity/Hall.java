package com.cinema.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "hall")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Hall extends BaseEntity {
	
	private List<Seat> seats;

}
