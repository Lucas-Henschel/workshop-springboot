package com.lucasweb.cource.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucasweb.cource.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
}
