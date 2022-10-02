package com.simplilearn.service.impl;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.entity.Admin;
import com.simplilearn.repository.AdminRepository;
import com.simplilearn.service.AdminService;
@Service
public class AdminServiceimpl implements AdminService {
 @Autowired
 AdminRepository adminRepo;
 
	
	@Override
	public Admin findByPassword(String password) {
		
		return adminRepo.findByPassword(password);
	}

	@Override
	public Admin addAdmin(Admin admin) {
		return adminRepo.save(admin); 
	}

	@Override
	public Admin updateAdmin(Long id, Admin admin) {
		Optional<Admin> admin1 = adminRepo.findById(id);
		if( admin1.isPresent()) {
		Admin updatedadmin = adminRepo.save(admin);
			return updatedadmin;
			
				
		}
		return admin;
		
		
		
	}

	@Override
	public Admin findById(Long id) {
	 Optional<Admin> admin = adminRepo.findById(id);
	 if (admin.isPresent()) {
		 return admin.get();
	 }
	 return null;
		
	}

}
