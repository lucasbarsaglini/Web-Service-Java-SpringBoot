package com.example.web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.web.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
