package com.example.CalenderAppDemo.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.CalenderAppDemo.entity.User;


public interface UserRepository extends JpaRepository<User, UUID>{
	
	boolean existsByEmailIgnoreCase(String email);

	Optional<User> findByEmailIgnoreCase(String email);

}
