package com.cinema.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.cinema.entity.enums.AgeLimit;
import com.cinema.entity.enums.Genre;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "movie")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Movie extends BaseEntity {
	
	private String name;

	private String description;
	
	private List<Genre> genre;
	
	private Integer runningTime;
	
	private AgeLimit ageLimit;

}
