package com.lucasweb.cource.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucasweb.cource.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}
