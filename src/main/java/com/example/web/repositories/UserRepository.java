package com.example.web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.web.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
