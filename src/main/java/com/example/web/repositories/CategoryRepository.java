package com.example.web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.web.entities.Category;

public interface CategoryRepository extends JpaRepository<Category	, Long>{

}
