package com.simplilearn.controller;

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

import com.simplilearn.entity.Movie;
import com.simplilearn.service.MovieService;

@RestController
@RequestMapping("/movie")
@CrossOrigin(origins = "*")
public class MovieController {
@Autowired
MovieService movieservice;
	
	@PostMapping("/add")
	Movie addMovie(@RequestBody Movie movie) {
		return movieservice.addMovie(movie);
		
	}
	@GetMapping("/all")
	List<Movie> findAll(){
		return movieservice.findAll();
		
	}
	@GetMapping("/language/{lang}")
	List<Movie> findByLang(@PathVariable String lang){
		return movieservice.findByLang(lang);	
	}
	@GetMapping("/genre/{genre}")
	List<Movie> findByGenre(@PathVariable String genre){
		return movieservice.findByGenre(genre);	
	}
	@GetMapping("/id/{id}")
	Movie findById(@PathVariable Long id){
		return movieservice.findById(id);	
	}
	@GetMapping("/name/{name}")
	Movie findByName(@PathVariable String name){
		return movieservice.findByName(name);	
	}
	@PutMapping("/update/{id}")
	Movie updateMovie(@PathVariable Long id, @RequestBody Movie movie) {
		
		return movieservice.updateMovie(id, movie);
		
	}
	
	@DeleteMapping("/delete/{id}")
	Movie deleteMovie(@PathVariable Long id) {
		return movieservice.deleteMovie(id);
		
	}
	
	
}
