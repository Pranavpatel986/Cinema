package com.simplilearn.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simplilearn.entity.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {
	
	List<Movie> findByLang(String lang);
	List<Movie> findByGenre (String genre);
	Movie findByName (String name);
	

}