package com.simplilearn.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.entity.User;
import com.simplilearn.repository.UserRepository;
import com.simplilearn.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepo;
	
	@Override
	public User addUser(User user) {
		return userRepo.save(user);
	}

	@Override
	public List<User> findAll() {
		
		return userRepo.findAll();
	}

	@Override
	public User findById(Long id) {
		Optional<User> user = userRepo.findById(id);
		if(user.isPresent()) {
			return user.get();
		}
		return null;
	}

	@Override
	public List<User> findByName(String username) {	
		return userRepo.findByUsername(username);
	}

	@Override
	public User findByPasword(String password) {
		return userRepo.findByPassword(password);
	}

	@Override
	public User updateUser(Long id, User user) {
		Optional<User> user1 = userRepo.findById(id);
		if(user1.isPresent()) {
			userRepo.save(user);
			return user;
		}
		return null;
	}

	@Override
	public User deleteUser(Long id) {
		userRepo.deleteById(id);
		return null;
	}

}
