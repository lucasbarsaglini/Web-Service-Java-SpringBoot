package com.example.web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.web.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
