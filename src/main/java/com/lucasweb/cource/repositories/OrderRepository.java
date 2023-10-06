package com.lucasweb.cource.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucasweb.cource.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
