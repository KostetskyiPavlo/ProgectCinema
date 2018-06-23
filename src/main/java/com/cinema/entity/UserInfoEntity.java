package com.cinema.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "user_info")
@Builder
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserInfoEntity extends BaseEntity {
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "phone_number")
	private String phoneNumber; //--------------
	
	@Column(name = "birthday")
	private String birthday;  //-----------------------
}
