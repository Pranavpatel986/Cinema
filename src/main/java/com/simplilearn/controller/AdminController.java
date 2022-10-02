package com.simplilearn.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.entity.Admin;
import com.simplilearn.service.AdminService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	AdminService adminrepo;
	
	@GetMapping("/{id}")
	Admin getAdmin (@PathVariable Long id) {
		return adminrepo.findById(id);
	}
	
	@PutMapping("/update/{id}")
	Admin updateAdmin(@PathVariable Long id , Admin admin) {
		return adminrepo.updateAdmin(id,admin);
		
	}
	
}
