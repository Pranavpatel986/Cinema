package com.simplilearn.controller;

import java.io.Console;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.entity.User;
import com.simplilearn.service.UserService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserService userService;
	
	@PostMapping("/add")
	User adduser (@RequestBody User user) {
		
		
		 userService.addUser(user);
		 return user;
	}
	
	@GetMapping()
	List<User> findAll(){
		return userService.findAll();
	}
	
	@GetMapping("/{id}")
	User findById(@PathVariable Long id) {
		return userService.findById(id);
		
	}
	@GetMapping("/username/{username}")
	List<User> findByUsername(@PathVariable String username) {
		return userService.findByName(username);
		
	}
	@GetMapping("/password")
	User findByPassword(@RequestParam String password) {
		return userService.findByPasword(password);
		
	}
	@PutMapping("/update/{id}")
	User updateUser(@PathVariable Long id , @RequestBody User user) {
		return userService.updateUser(id, user);
	}
	@DeleteMapping("/delete/{id}")
	User deleteuser(@PathVariable Long id) {
		return userService.deleteUser(id);
	}
	
}
