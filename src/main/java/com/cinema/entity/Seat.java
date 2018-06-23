package com.cinema.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "seat")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Seat extends BaseEntity {

	private Integer row;

	private Integer place;
}
