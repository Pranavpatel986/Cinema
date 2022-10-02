package com.simplilearn.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.simplilearn.entity.User;

@Service
public interface UserService {
 User addUser(User user);
 
 List<User> findAll();
 User findById (Long id);
 List<User> findByName (String username);
 User findByPasword (String password);
 
 User updateUser (Long id, User user);
 User deleteUser (Long id);
}
