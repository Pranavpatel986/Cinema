package com.simplilearn.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simplilearn.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
	
	List<User> findByUsername (String username);
	User findByPassword (String password);

}
