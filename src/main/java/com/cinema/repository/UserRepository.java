package com.cinema.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cinema.entity.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
	
	@Query("SELECT u FROM UserEntity u WHERE u.email = :email")
	UserEntity findUserByEmail(@Param("email") String email);
}
