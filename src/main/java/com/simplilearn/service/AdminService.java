package com.simplilearn.service;



import org.springframework.stereotype.Service;

import com.simplilearn.entity.Admin;

@Service
public interface AdminService {
Admin addAdmin(Admin admin);	
Admin findById (Long id);
Admin findByPassword(String password);
Admin updateAdmin (Long id, Admin admin);
}
