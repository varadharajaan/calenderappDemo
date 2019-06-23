package com.example.CalenderAppDemo.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.CalenderAppDemo.entity.CalenderApp;


public interface CalenderAppRepository extends JpaRepository<CalenderApp, UUID>{

}
