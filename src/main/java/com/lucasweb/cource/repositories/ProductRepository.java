package com.lucasweb.cource.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucasweb.cource.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
