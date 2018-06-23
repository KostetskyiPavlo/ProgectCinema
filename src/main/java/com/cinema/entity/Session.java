package com.cinema.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "session")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Session extends BaseEntity  {
	
	private Movie movie;
	
	private Hall hall;

}
