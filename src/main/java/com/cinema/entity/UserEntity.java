package com.cinema.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import com.cinema.entity.enums.UserRole;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "user")
@Builder
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserEntity extends BaseEntity {
	
	@Column(unique = true)
	private String email;
		
	private String password;
	
	@Enumerated(EnumType.STRING)
	private UserRole role;

}
