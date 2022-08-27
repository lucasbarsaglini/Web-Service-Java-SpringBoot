package com.example.web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.web.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
