package com.simplilearn.repository;

import org.springframework.data.jpa.repository.JpaRepository;  
import org.springframework.stereotype.Repository;

import com.simplilearn.entity.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Long> {
	
	
	Admin findByPassword(String password);
	Admin findByName(String name);
	
}
