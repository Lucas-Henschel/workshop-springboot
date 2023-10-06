package com.lucasweb.cource.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucasweb.cource.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
